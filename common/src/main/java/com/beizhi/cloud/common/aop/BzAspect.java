package com.beizhi.cloud.common.aop;

import com.beizhi.cloud.common.protocal.RequestHeader;
import com.beizhi.cloud.common.protocal.ServiceRequest;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.UUID;

/**
 * Created by eric on 16/11/19.
 */
@Aspect
@Component
public class BzAspect {

    private final Gson gson_format = new GsonBuilder().setExclusionStrategies(new ExclusionStrategy() {
        @Override
        public boolean shouldSkipField(FieldAttributes f) {
            return f.getName().equals("attachment") || f.getName().equals("__isset_bitfield");
        }

        @Override
        public boolean shouldSkipClass(Class<?> clazz) {
            return clazz == ByteBuffer.class;
        }
    }).setPrettyPrinting().create();


    @Pointcut("@within(com.beizhi.cloud.common.aop.BzService)")
    public void aroundPointCut() {
    }

    @Around("com.beizhi.cloud.common.aop.BzAspect.aroundPointCut()")
    public Object doLoggerPointCut(ProceedingJoinPoint jp) throws Throwable {
        long startTime = System.currentTimeMillis();

        StringBuilder logHeader = new StringBuilder();

        try {
            // 获取连接点的方法签名对象
            MethodSignature joinPointObject = (MethodSignature) jp.getSignature();
            // 连接点对象的方法
            Method method = joinPointObject.getMethod();
            // 获取连接点所在的目标对象
            Object target = jp.getTarget();

            Object[] args = jp.getArgs();

            logHeader.append("["+target.getClass().getSimpleName()).append(" ").append(method.getName()).append("] ");

            ServiceRequest header=null;
            RequestHeader requestHeader;
            boolean hasRequestHeader = false;
            if (args != null && args.length > 0) {
                Object arg = args[0];

                if (arg instanceof ServiceRequest) {
                    header = (ServiceRequest) arg;
                    requestHeader = ((ServiceRequest) arg).getRequestHeader();

                    logHeader.append("").append(requestHeader.getSessionId()).append(" ")
                            .append(requestHeader.getCallerIP()).append(" ")
                            .append(requestHeader.getCallerFrom().name()).append(" ")
                            .append(requestHeader.getOperatorId()).append(" ")
                            .append(requestHeader.getOperatorName()).append(" ")
                            .append(requestHeader.getCustomerId()).append(" ")
                            .append(requestHeader.getCustomerName()).append("");

                    hasRequestHeader = true;
                }
            }


            System.out.printf("request:{} {}",logHeader.toString(), gson_format.toJson(args));


            Object proceed = jp.proceed();

            System.out.printf("response:{} {}ms", logHeader.toString(), (System.currentTimeMillis() - startTime));

            return proceed;
        } catch (Throwable e) {
            System.err.printf("error:" + logHeader.toString() + " " + (System.currentTimeMillis() - startTime) + "ms", e);
//            if (e instanceof BaseServiceException) {
//                throw e;
//            } else if (e instanceof KuaisuServiceException) {
//                KuaisuServiceException ke = (KuaisuServiceException) e;
//                throw new BaseServiceException(ke.getErrorCode(), ke.getMessage());
//            } else {
//                throw formatExceptionFriendly(e);
//            }
            throw e;
        } finally {
        }
    }
}

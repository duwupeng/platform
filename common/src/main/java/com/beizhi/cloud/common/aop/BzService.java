package com.beizhi.cloud.common.aop;

import java.lang.annotation.*;

/**
 * Created by eric on 16/11/19.
 */
@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface BzService {
}

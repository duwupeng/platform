package com.beizhi.cloud.mq.sender;

import com.beizhi.cloud.mq.bind.Barista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by eric on 16/11/16.
 */
@Service
public class RabbitSender {
    @Autowired
    private Barista source;

    // 发送消息
    public String sendMessage(String msg){
        try{
            source.logOutPut().send(MessageBuilder.withPayload(msg).build());
            System.out.println("发送了"+msg);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}

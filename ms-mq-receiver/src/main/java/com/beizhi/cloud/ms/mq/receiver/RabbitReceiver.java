package com.beizhi.cloud.ms.mq.receiver;

import com.beizhi.cloud.ms.mq.bind.Barista;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
/**
 * Created by eric on 16/11/16.
 */
@EnableBinding(Barista.class)
public class RabbitReceiver {


    @StreamListener(Barista.INPUT_CHANNEL)
    public void receiver(Message<Object> message){
        Object obj = message.getPayload();
        System.out.println("接受对象Channel:"+obj+"\n");
    }

    @StreamListener(Barista.INPUT_CHANNEL_ANOTHER)
    public void receiverAnotherChannel(Message<Object> message){
        Object obj = message.getPayload();
        System.out.println("接受对象AnotherChannel:"+obj+"\n");
    }

}

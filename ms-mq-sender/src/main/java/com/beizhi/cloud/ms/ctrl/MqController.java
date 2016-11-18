package com.beizhi.cloud.ms.ctrl;

import com.beizhi.cloud.ms.mq.sender.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class MqController {

	@Autowired
	RabbitSender rabbitSender;
	
	@GetMapping(value="/send/{msg}")
	public String send(@PathVariable("msg") String msg){
		rabbitSender.sendMessage("send" + msg);
		return "send OUTPUT_CHANNEL "+msg;
	}

	@GetMapping(value="/sendAnother/{msg}")
	public String  sendToAnotherChannel(@PathVariable("msg") String msg){
		rabbitSender.sendMessageToAnotherChannel("sendAnother" + msg);
		return "send OUTPUT_CHANNEL_ANOTHER "+msg;

	}
}

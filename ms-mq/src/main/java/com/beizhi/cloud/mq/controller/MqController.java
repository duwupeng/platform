package com.beizhi.cloud.mq.controller;

import com.beizhi.cloud.mq.sender.RabbitSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class MqController {

	@Autowired
	RabbitSender rabbitSender;
	
	@GetMapping(value="/send/{msg}")
	public void send(@PathVariable("msg") String msg){
		rabbitSender.sendMessage("send" + msg);
	}

	@GetMapping(value="/sendAnother/{msg}")
	public void sendToAnotherChannel(@PathVariable("msg") String msg){
		rabbitSender.sendMessageToAnotherChannel("sendAnother" + msg);
	}
}

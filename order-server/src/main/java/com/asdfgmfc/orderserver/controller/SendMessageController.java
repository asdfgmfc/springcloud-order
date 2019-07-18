package com.asdfgmfc.orderserver.controller;

import com.asdfgmfc.orderserver.dto.OrderDTO;
import com.asdfgmfc.orderserver.message.StreamClient;
//import com.asdfgmfc.orderserver.rabbit.IMessageProvider;
import com.asdfgmfc.orderserver.message2.StreamClient2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;

@RestController
public class SendMessageController {
    @Autowired
    private StreamClient streamClient;

//    @GetMapping("/sendMessage")
//    public void process() {
//        String message = "now " + new Date();
//        streamClient.output().send(MessageBuilder.withPayload(message).build());
//    }

    @GetMapping("/sendMessage")
    public void process() {
        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setOrderId("123456");
        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
//        streamClient.input().send(MessageBuilder.withPayload(orderDTO).build());
    }

//    @Resource
//    private IMessageProvider iMessageProvider;
//
//    @GetMapping("/process2")
//    public void process2() {
//        iMessageProvider.send("aaa");
//    }

//    @Autowired
//    private StreamClient2 streamClient2;
//
//    @GetMapping("/sendMessage2")
//    public void process2() {
//        OrderDTO orderDTO = new OrderDTO();
//        orderDTO.setOrderId("123456");
////        streamClient.output().send(MessageBuilder.withPayload(orderDTO).build());
//        streamClient2.output().send(MessageBuilder.withPayload(orderDTO).build());
//    }
}

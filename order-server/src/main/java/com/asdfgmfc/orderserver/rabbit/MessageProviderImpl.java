package com.asdfgmfc.orderserver.rabbit;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

import javax.annotation.Resource;

//@EnableBinding(Source.class)
//public class MessageProviderImpl implements IMessageProvider {
//    @Resource
//    private MessageChannel output;
//
//    @Override
//    public void send(String str) {
//        this.output.send(MessageBuilder.withPayload(str).build());
//    }
//}

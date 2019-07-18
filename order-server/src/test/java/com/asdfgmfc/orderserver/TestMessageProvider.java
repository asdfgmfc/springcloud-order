package com.asdfgmfc.orderserver;

//import com.asdfgmfc.orderserver.rabbit.IMessageProvider;
import com.asdfgmfc.orderserver.message.StreamClient;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMessageProvider {
//    @Resource
//    private IMessageProvider iMessageProvider;

//    @Test
//    public void test() {
//        this.iMessageProvider.send("aaa");
//    }

    @Autowired
    private StreamClient streamClient;

    @Test
    public void test1() {
        streamClient.input().send(MessageBuilder.withPayload("abcdefg").build());
    }
}

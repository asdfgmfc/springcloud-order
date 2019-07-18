package com.asdfgmfc.orderserver.message2;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient2.class)
@Slf4j
public class StreamReceiver2 {
//    @StreamListener(StreamClient.INPUT)
//    @SendTo(StreamClient.OUTPUT)
//    public Object processInput(Object message) {
//        log.info("StreamReceiver1 : {}", message);
//        return message;
//    }
//
//    @StreamListener(StreamClient.OUTPUT)
//    public void processOutput(Object message) {
//        log.info("StreamReceiver2 : {}", new String((byte[]) message));
//    }

    @StreamListener(StreamClient2.OUTPUT)
    public void processOutput(Object message) {
        log.info("StreamReceiver22 : {}", message);
    }

}

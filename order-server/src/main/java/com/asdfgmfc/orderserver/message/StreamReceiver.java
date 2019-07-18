package com.asdfgmfc.orderserver.message;

import com.asdfgmfc.orderserver.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {
//    @StreamListener(StreamClient.INPUT)
//    @SendTo(StreamClient.OUTPUT)
    @StreamListener(StreamClient.OUTPUT)
    @SendTo(StreamClient.INPUT2)
    public String processInput(Object message) {
        log.info("StreamReceiver1 : {}", message);
        return "received";
    }
//
//    @StreamListener(StreamClient.OUTPUT)
//    public void processOutput(Object message) {
//        log.info("StreamReceiver2 : {}", new String((byte[]) message));
//    }

    @StreamListener(StreamClient.INPUT2)
    public void processOutput(Object message) {
        log.info("StreamReceiver2 : {}", message);
    }

}

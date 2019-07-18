package com.asdfgmfc.orderserver.message2;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StreamClient2 {
    String INPUT = "myMessageInput2";
    String OUTPUT = "myMessageOutput2";

//    @Input(StreamClient2.INPUT)
//    SubscribableChannel input();

    @Output(StreamClient2.OUTPUT)
    MessageChannel output();
}

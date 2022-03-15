package com.example.websocketserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class MessageController {

    @MessageMapping("/greeting")
    public void handle(String greeting) {
        log.info("Receiving message '{}'", greeting);
    }
}

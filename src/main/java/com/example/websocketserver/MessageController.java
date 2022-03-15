package com.example.websocketserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import java.time.Instant;

@Controller
@Slf4j
public class MessageController {

    @MessageMapping("/greeting")
    public String handle(String greeting) {
        log.info("Receiving message '{}'", greeting);
        return "[" + Instant.now().toString() + ": " + greeting;
    }
}

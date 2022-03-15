package com.example.websocketserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Slf4j
public class ScheduledTasks {

    @Autowired
    public ScheduledTasks(SimpMessagingTemplate template) {
        this.template = template;
    }

    @Scheduled(fixedRate = 10000)
    public void broadcastMessage() {
        log.info("Broadcasting message...");

        String destination = "/broadcast/greeting";
        String message = String.format("Broadcast at %s", Instant.now().toString());

        this.template.convertAndSend(destination, message);
    }

    private final SimpMessagingTemplate template;
}

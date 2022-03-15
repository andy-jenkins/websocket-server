package com.example.websocketserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker
@Slf4j
public class WebSocketMessageBrokerConfig implements WebSocketMessageBrokerConfigurer {

    @Override
    public void configureMessageBroker(MessageBrokerRegistry config) {
        log.info("Configuring message broker...");

        // STOMP messages whose destination header
        // begins with one of the configured prefixes,
        // are routed to @MessageMapping methods in @Controller classes.
        config.setApplicationDestinationPrefixes("/consume");

        // STOMP messages whose destination header
        // begins with one of the configured prefixes,
        // are routed to the message broker.
        // Clients can subscribe in order to receive messages.
        config.enableSimpleBroker("/broadcast");
    }

    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        log.info("Registering stomp endpoints...");

        // The route to which WebSocket clients need to connect
        // for the WebSocket handshake.
        // For example 'ws://localhost:10101/socket',
        // or for SockJS 'http://localhost:10101/socket'.
        registry.addEndpoint("/socket").setAllowedOrigins("*");
    }
}

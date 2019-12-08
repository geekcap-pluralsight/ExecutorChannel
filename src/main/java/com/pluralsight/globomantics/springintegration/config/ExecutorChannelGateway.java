package com.pluralsight.globomantics.springintegration.config;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = "executorChannelGateway", defaultRequestChannel = "executorChannel")
public interface ExecutorChannelGateway {
    @Gateway
    void createReservationRecord(Message<String> lastName);
}
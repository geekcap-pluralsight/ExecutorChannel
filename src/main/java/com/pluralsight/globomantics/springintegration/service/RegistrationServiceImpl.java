package com.pluralsight.globomantics.springintegration.service;

import com.pluralsight.globomantics.springintegration.config.ExecutorChannelGateway;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    private static final Logger logger = LogManager.getLogger(RegistrationServiceImpl.class);

    @Autowired
    private ExecutorChannelGateway executorChannelGateway;

    @Override
    public void setupReservation(String ... lastNames) {
        for (String lastName :lastNames ) {
            logger.info("[Thread ID: {}] Setup Reservation for user {}", Thread.currentThread().getId(), lastName);

            // Create the reservation record
            executorChannelGateway.createReservationRecord(MessageBuilder.withPayload(lastName).build());
        }

        // Do other things for reservation setup...
    }
}

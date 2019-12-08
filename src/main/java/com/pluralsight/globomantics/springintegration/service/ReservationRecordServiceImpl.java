package com.pluralsight.globomantics.springintegration.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

@Service
public class ReservationRecordServiceImpl implements ReservationRecordService {
    private static final Logger logger = LogManager.getLogger(ReservationRecordServiceImpl.class);

    @ServiceActivator(inputChannel = "executorChannel")
    @Override
    public void createReservationRecord(Message<String> lastName) {
        logger.info("[Thread ID: {}] Creating reservation record for user {}", Thread.currentThread().getId(), lastName.getPayload());
    }
}

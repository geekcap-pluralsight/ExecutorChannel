package com.pluralsight.globomantics.springintegration.service;

import org.springframework.messaging.Message;

public interface ReservationRecordService {
    void createReservationRecord(Message<String> lastName);
}

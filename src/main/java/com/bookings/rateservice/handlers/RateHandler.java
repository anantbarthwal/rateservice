package com.bookings.rateservice.handlers;

import com.bookings.rateservice.models.RateCreateRequest;
import org.springframework.stereotype.Component;

@Component
public class RateHandler {

    public Double calculateRateForReservation(RateCreateRequest rateCreateRequest) {
        Double totalRate = 3.0 * rateCreateRequest.getNumberOfNights();
        return totalRate;
    }
}

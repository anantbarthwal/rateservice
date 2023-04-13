package com.bookings.rateservice.controllers;

import com.bookings.rateservice.handlers.RateHandler;
import com.bookings.rateservice.models.RateCreateRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rates")
public class RateController {
    @Autowired
    private RateHandler rateHandler;
    @PostMapping("/create")
    public Double calculateRateForReservation(@RequestBody RateCreateRequest rateCreateRequest) {
        return rateHandler.calculateRateForReservation(rateCreateRequest);
    }
}

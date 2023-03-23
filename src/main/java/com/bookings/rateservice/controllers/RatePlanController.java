package com.bookings.rateservice.controllers;

import com.bookings.rateservice.handlers.RatePlanHandler;
import com.bookings.rateservice.models.RatePlan;
import com.bookings.rateservice.models.RoomTypeAddRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratePlans")
public class RatePlanController {

    @Autowired
    private RatePlanHandler ratePlanHandler;
    @GetMapping
    public List<RatePlan> getRatePlans() {
        return ratePlanHandler.getRatePlans();
    }

    @GetMapping("/id/{id}")
    public RatePlan getRatePlanById(@PathVariable String id) {
        return ratePlanHandler.getRatePlanById(id);
    }

    @PostMapping("/create")
    public RatePlan createRatePlan(@RequestBody RatePlan ratePlan) {
        return ratePlanHandler.createRatePlan(ratePlan);
    }

    @PostMapping("/ratePlan/id/{id}")
    public RatePlan addRoomTypes(@PathVariable String id, @RequestBody RoomTypeAddRequest roomTypeAddRequest) {
        return ratePlanHandler.addRoomTypes(id, roomTypeAddRequest);
    }
}

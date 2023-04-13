package com.bookings.rateservice.handlers;

import com.bookings.rateservice.domains.RatePlanDomain;
import com.bookings.rateservice.models.RatePlan;
import com.bookings.rateservice.models.RoomTypeAddRequest;
import com.bookings.rateservice.repositories.RatePlanCustomRepository;
import com.bookings.rateservice.repositories.RatePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RatePlanHandler {

    @Autowired
    private RatePlanRepository ratePlanRepository;

    @Autowired
    private RatePlanCustomRepository ratePlanCustomRepository;

    public List<RatePlan> getRatePlans() {
        return ratePlanRepository.findAll().stream().map(domain-> domain.toModel()).collect(Collectors.toList());
    }

    public RatePlan getRatePlanById(String id) {
        Optional<RatePlanDomain> ratePlanDomain = ratePlanRepository.findById(id);
        if(ratePlanDomain.isPresent()) {
            return ratePlanDomain.get().toModel();
        }
        return null;
    }

    public RatePlan createRatePlan(RatePlan ratePlan) {
        RatePlanDomain ratePlanDomain = new RatePlanDomain();
        ratePlanDomain.setStartDate(ratePlan.getStartDate());
        ratePlanDomain.setEndDate(ratePlan.getEndDate());
        ratePlanDomain.setName(ratePlan.getName());
        return ratePlanRepository.save(ratePlanDomain).toModel();
    }

    public RatePlan addRoomTypes(String id, RoomTypeAddRequest roomTypeAddRequest) {
        return ratePlanCustomRepository.addRoomTypes(id, roomTypeAddRequest).toModel();
    }
}

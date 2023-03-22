package com.bookings.rateservice.handlers;

import com.bookings.rateservice.domains.RoomTypeDomain;
import com.bookings.rateservice.models.RoomType;
import com.bookings.rateservice.repositories.RoomTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RoomTypeHandler {
    @Autowired
    private RoomTypeRepository roomTypeRepository;

    public RoomType createRoomType(RoomType roomType) {
        return roomTypeRepository.save(new RoomTypeDomain(roomType.getName(), roomType.getCode(),
                roomType.getRate())).toModel();
    }

    public List<RoomType> getRoomTypes() {
        return roomTypeRepository.findAll().stream().map(domain-> domain.toModel()).collect(Collectors.toList());
    }

    public RoomType getRoomTypeById(String id) {
        Optional<RoomTypeDomain> roomTypeDomain = roomTypeRepository.findById(id);
        if(roomTypeDomain.isPresent()) {
            return roomTypeDomain.get().toModel();
        }
        return null;
    }
}

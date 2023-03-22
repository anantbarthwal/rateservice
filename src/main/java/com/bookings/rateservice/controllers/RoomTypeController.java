package com.bookings.rateservice.controllers;

import com.bookings.rateservice.handlers.RoomTypeHandler;
import com.bookings.rateservice.models.RoomType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roomTypes")
public class RoomTypeController {
    @Autowired
    private RoomTypeHandler roomTypeHandler;
    @PostMapping("/create")
    public RoomType createRoomType(@RequestBody RoomType roomType) {
        return roomTypeHandler.createRoomType(roomType);
    }

    @GetMapping
    public List<RoomType> getRoomTypes() {
        return roomTypeHandler.getRoomTypes();
    }

    @GetMapping("/roomType/{id}")
    public RoomType getRoomTypeById(@PathVariable String id) {
        return roomTypeHandler.getRoomTypeById(id);
    }
}

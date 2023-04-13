package com.bookings.rateservice.controllers;

import com.bookings.rateservice.handlers.RoomHandler;
import com.bookings.rateservice.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomHandler roomHandler;
    @GetMapping
    public List<Room> getAllRooms() {
        return roomHandler.getAllRooms();
    }

    @GetMapping("/id/{id}")
    public Room getRoomById(@PathVariable String id) {
        return roomHandler.getRoomById(id);
    }

    @PostMapping("/create")
    public Room createRoom(@RequestBody Room room) {
        return roomHandler.createRoom(room);
    }
}

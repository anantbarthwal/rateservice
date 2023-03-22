package com.bookings.rateservice.handlers;

import com.bookings.rateservice.domains.RoomDomain;
import com.bookings.rateservice.models.Room;
import com.bookings.rateservice.repositories.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class RoomHandler {
    @Autowired
    private RoomRepository roomRepository;

    public Room createRoom(Room room) {
        RoomDomain roomDomain = new RoomDomain(room.getRoomNumber(), true, room.getRoomTypeId());
        return roomRepository.save(roomDomain).toModel();
    }

    public Room getRoomById(String id) {
        Optional<RoomDomain> roomDomain = roomRepository.findById(id);
        if(roomDomain.isPresent()) {
            return roomDomain.get().toModel();
        }
        else return  null;
    }

    public List<Room> getAllRooms() {
        return  roomRepository.findAll().stream().map(domain-> domain.toModel()).collect(Collectors.toList());
    }
}

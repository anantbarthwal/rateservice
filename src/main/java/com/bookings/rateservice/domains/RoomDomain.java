package com.bookings.rateservice.domains;

import com.bookings.rateservice.models.Room;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "room")
public class RoomDomain {
    @Id
    private String id;
    private String roomNumber;

    private Boolean active;

    private String roomTypeId;

    public RoomDomain() {}

    public RoomDomain(String roomNumber, Boolean active, String roomTypeId) {
        this.roomNumber = roomNumber;
        this.active = active;
        this.roomTypeId = roomTypeId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(String roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Room toModel() {
        Room room = new Room();
        room.setId(id);
        room.setRoomNumber(roomNumber);
        room.setActive(active);
        room.setRoomTypeId(roomTypeId);

        return room;
    }
}

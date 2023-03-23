package com.bookings.rateservice.models;

import java.util.Map;

public class RoomTypeAddRequest {
    private Map<String, Double> rateByRoomTypeId;

    public Map<String, Double> getRateByRoomTypeId() {
        return rateByRoomTypeId;
    }

    public void setRateByRoomTypeId(Map<String, Double> rateByRoomTypeId) {
        this.rateByRoomTypeId = rateByRoomTypeId;
    }
}

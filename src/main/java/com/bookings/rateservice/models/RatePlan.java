package com.bookings.rateservice.models;

import java.util.Date;
import java.util.Map;

public class RatePlan {
    private String id;
    private String name;

    private Date startDate;
    private Date endDate;

    private Map<String, Double> rateByRoomTypeId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Map<String, Double> getRateByRoomTypeId() {
        return rateByRoomTypeId;
    }

    public void setRateByRoomTypeId(Map<String, Double> rateByRoomTypeId) {
        this.rateByRoomTypeId = rateByRoomTypeId;
    }
}

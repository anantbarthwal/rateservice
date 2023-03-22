package com.bookings.rateservice.domains;

import com.bookings.rateservice.models.RoomType;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "roomType")
public class RoomTypeDomain {
    private String id;
    private String name;
    private String code;
    private Double rate;

    public RoomTypeDomain() {}

    public RoomTypeDomain(String name, String code, Double rate) {
        this.name = name;
        this.code = code;
        this.rate = rate;
    }

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public RoomType toModel() {
        RoomType roomType = new RoomType();
        roomType.setId(id);
        roomType.setCode(code);
        roomType.setName(name);
        roomType.setRate(rate);

        return roomType;
    }
}

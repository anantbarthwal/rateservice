package com.bookings.rateservice.repositories;

import com.bookings.rateservice.domains.RatePlanDomain;
import com.bookings.rateservice.models.RoomTypeAddRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RatePlanCustomRepository {

    @Autowired
    private MongoTemplate mongoTemplate;

    public RatePlanDomain findRatePlanById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        RatePlanDomain ratePlan = mongoTemplate.findOne(query, RatePlanDomain.class);
        return ratePlan;
    }

    public RatePlanDomain addRoomTypes(String id, RoomTypeAddRequest roomTypeAddRequest) {
        Map<String, Double> ratesByRoomType;

        RatePlanDomain ratePlan = findRatePlanById(id);
        if(roomTypeAddRequest != null && !CollectionUtils.isEmpty(roomTypeAddRequest.getRateByRoomTypeId())) {
            if(CollectionUtils.isEmpty(ratePlan.getRateByRoomTypeId())) {
                ratesByRoomType = new HashMap<>();
            }
            else {
                ratesByRoomType = ratePlan.getRateByRoomTypeId();
            }
            roomTypeAddRequest.getRateByRoomTypeId().forEach((roomtype, rate) -> {
                ratesByRoomType.put(roomtype, rate);
            });
            ratePlan.setRateByRoomTypeId(ratesByRoomType);
            Query query = new Query();
            query.addCriteria(Criteria.where("id").is(id));
            return mongoTemplate.save(ratePlan);
        }
        else return  null;
    }
}
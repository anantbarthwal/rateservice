package com.bookings.rateservice.repositories;

import com.bookings.rateservice.domains.RoomTypeDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomTypeRepository extends MongoRepository<RoomTypeDomain, String> {
}

package com.bookings.rateservice.repositories;

import com.bookings.rateservice.domains.RoomDomain;
import com.bookings.rateservice.models.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends MongoRepository<RoomDomain, String> {
}

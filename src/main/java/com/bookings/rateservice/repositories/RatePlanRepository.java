package com.bookings.rateservice.repositories;

import com.bookings.rateservice.domains.RatePlanDomain;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatePlanRepository extends MongoRepository<RatePlanDomain, String> {
}

package com.payment.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.entity.UserDetails;

//Dao Layer
@Repository
public interface UserRepository extends MongoRepository<UserDetails, Integer>
{

	
}

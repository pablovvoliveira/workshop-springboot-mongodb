package com.pablovvoliveira.demo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pablovvoliveira.demo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	User save(Optional<User> newObj);
	
}

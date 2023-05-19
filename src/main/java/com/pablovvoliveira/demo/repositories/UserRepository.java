package com.pablovvoliveira.demo.repositories;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pablovvoliveira.demo.domain.User;

public interface UserRepository extends MongoRepository<User, String> {

	User save(Optional<User> newObj);
	
}

package com.pablovvoliveira.demo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.pablovvoliveira.demo.domain.Post;


public interface PostRepository extends MongoRepository<Post, String> {

	
}

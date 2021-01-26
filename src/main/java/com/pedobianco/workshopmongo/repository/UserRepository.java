package com.pedobianco.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedobianco.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
	
	

}

package com.jacksonccosta.javaspringmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jacksonccosta.javaspringmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}

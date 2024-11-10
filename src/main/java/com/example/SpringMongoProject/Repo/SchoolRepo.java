package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SchoolRepo extends MongoRepository<School, String> {
}

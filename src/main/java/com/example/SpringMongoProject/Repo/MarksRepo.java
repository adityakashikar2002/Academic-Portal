package com.example.SpringMongoProject.Repo;

import com.example.SpringMongoProject.Entity.Marks;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MarksRepo extends MongoRepository<Marks, String> {
}

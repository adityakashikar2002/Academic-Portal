// MarksServices.java
package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.Marks;
import com.example.SpringMongoProject.Repo.MarksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MarksServices implements BaseService<Marks, String> {

    @Autowired
    private MarksRepo repo;

    @Override
    public void saveOrUpdate(Marks marks) {
        repo.save(marks);
    }

    @Override
    public Iterable<Marks> listAll() {
        return repo.findAll();
    }

    @Override
    public Optional<Marks> getById(String id) {
        return repo.findById(id);
    }

    @Override
    public void deleteById(String id) {
        repo.deleteById(id);
    }
}

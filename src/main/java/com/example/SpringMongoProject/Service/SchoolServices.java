// SchoolServices.java
package com.example.SpringMongoProject.Service;

import com.example.SpringMongoProject.Entity.School;
import com.example.SpringMongoProject.Repo.SchoolRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SchoolServices implements BaseService<School, String> {

    @Autowired
    private SchoolRepo repo;

    @Override
    public void saveOrUpdate(School school) {
        repo.save(school);
    }

    @Override
    public Iterable<School> listAll() {
        return repo.findAll();
    }

    @Override
    public Optional<School> getById(String id) {
        return repo.findById(id);
    }

    @Override
    public void deleteById(String id) {
        repo.deleteById(id);
    }
}

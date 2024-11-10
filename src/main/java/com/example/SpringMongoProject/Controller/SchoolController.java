package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.School;
import com.example.SpringMongoProject.Service.SchoolServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/school")
public class SchoolController {

    @Autowired
    private SchoolServices schoolServices;

    @PostMapping("/save")
    public String saveSchool(@RequestBody School school) {
        schoolServices.saveOrUpdate(school);
        return school.get_id();
    }

    @GetMapping("/getall")
    public Iterable<School> getSchool() {
        return schoolServices.listAll();
    }

    @PutMapping("/edit/{id}")
    public School update(@RequestBody School school, @PathVariable("id") String _id) {
        school.set_id(_id);
        schoolServices.saveOrUpdate(school);
        return school;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteSchool(@PathVariable("id") String _id) {
        schoolServices.deleteById(_id);
    }

    @GetMapping("/search/{id}")
    public Optional<School> getSchool(@PathVariable("id") String schoolId) {
        return schoolServices.getById(schoolId);
    }
}

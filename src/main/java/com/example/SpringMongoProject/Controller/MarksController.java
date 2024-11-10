package com.example.SpringMongoProject.Controller;

import com.example.SpringMongoProject.Entity.Marks;
import com.example.SpringMongoProject.Service.MarksServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/marks")
public class MarksController {

    @Autowired
    private MarksServices marksServices;

    @PostMapping("/save")
    public String saveMarks(@RequestBody Marks marks) {
        marksServices.saveOrUpdate(marks);
        return marks.get_id();
    }

    @GetMapping("/getall")
    public Iterable<Marks> getAllMarks() {
        return marksServices.listAll();
    }

    @PutMapping("/edit/{id}")
    public Marks updateMarks(@RequestBody Marks marks, @PathVariable("id") String _id) {
        marks.set_id(_id);
        marksServices.saveOrUpdate(marks);
        return marks;
    }

    @DeleteMapping("/delete/{id}")
    public void deleteMarks(@PathVariable("id") String _id) {
        marksServices.deleteById(_id);
    }

    @GetMapping("/search/{id}")
    public Optional<Marks> getMarks(@PathVariable("id") String id) {
        return marksServices.getById(id);
    }
}

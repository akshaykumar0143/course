package com.product.controller;

import com.product.entity.Course;
import com.product.service.CourseService;
import com.product.service.CourseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService controller;


@PostMapping("/update&Save")
    public ResponseEntity<String> updSave(@RequestBody Course course) {
        String status = controller.updSave(course);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("/all")
    public ResponseEntity< List<Course>> getAllCourses() {
        List<Course> allCourse = controller.getAllCourses();
        return new ResponseEntity<>(allCourse, HttpStatus.OK);
    }

    @GetMapping("/all/{id}")
    public ResponseEntity<Course> getById(@PathVariable Integer id){
        Course byId = controller.getById(id);
        return new ResponseEntity<>(byId, HttpStatus.OK);

    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id) {
        String delete = controller.deleteById(id);
        return new ResponseEntity<>(delete, HttpStatus.OK);
    }

    }


package com.product.service;

import com.product.entity.Course;
import com.product.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{
    @Autowired
    private CourseRepository repo;


    @Override
    public String updSave(Course course) {
        repo.save(course);
        return "Hey, I saved your details";
    }


    @Override
    public List<Course> getAllCourses() {
       return repo.findAll();
    }

    @Override
    public Course getById(Integer id) {
        Optional<Course> courseId = repo.findById(id);
        if(courseId.isPresent()){
            return courseId.get();
        }

        return null;
    }

    @Override
    public String deleteById(Integer id) {
        if(repo.existsById(id)){
            repo.deleteById(id);
            return "Deleted!!!";
        }else {
        return "No Record Found!!!";
    }
}}

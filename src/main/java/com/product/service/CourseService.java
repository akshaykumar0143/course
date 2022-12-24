package com.product.service;

import com.product.entity.Course;

import java.util.List;

public interface CourseService {

    public String updSave(Course course);
    public List<Course> getAllCourses();
    public Course getById(Integer id);
    public String deleteById(Integer id);


}

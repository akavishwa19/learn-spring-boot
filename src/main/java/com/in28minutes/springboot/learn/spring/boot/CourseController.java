package com.in28minutes.springboot.learn.spring.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    @RequestMapping("/courses")
    public List<Course> RetrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"springboot","in28minutes"),
                new Course(1,"springboot","in28minutes")
        );
    }
}

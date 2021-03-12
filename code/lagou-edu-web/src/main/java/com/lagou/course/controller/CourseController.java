package com.lagou.course.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lagou.course.CourseService;
import com.lagou.entity.Course;
import com.lagou.entity.User;
import com.lagou.entity.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("course")
public class CourseController {

    @Reference // 远程消费
    private CourseService courseService;

    @GetMapping("getAllCourse")
    public List<Course> getAllCourse() {
        List<Course> list = courseService.getAllCourse();
        return list;
    }

    @GetMapping("getCourseByUserId/{userid}")
    public List<Course> getCourseByUserId( @PathVariable("userid") String userid ) {
        List<Course> list = courseService.getCourseByUserId(userid);
        return list;
    }

    @GetMapping("getCourseById/{courseid}")
    public Course getCourseById(@PathVariable("courseid")Integer courseid) {
        Course course = courseService.getCourseById(courseid);
        return course;
    }
}

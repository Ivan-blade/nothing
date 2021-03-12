package com.lagou.course.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lagou.course.CourseService;
import com.lagou.entity.Course;
import mapper.CourseDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    public List<Course> getAllCourse() {
        return courseDao.getAllCourse();
    }

    public List<Course> getCourseByUserId(String userId) {
        return courseDao.getCourseByUserId(userId);
    }
    public Course getCourseById(Integer courseid) {
        return courseDao.getCourseById(courseid);
    }
}

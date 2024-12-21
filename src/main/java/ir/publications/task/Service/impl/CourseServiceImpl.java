package ir.publications.task.Service.impl;

import ir.publications.task.Repository.CourseRepository;
import ir.publications.task.Service.CourseService;
import ir.publications.task.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository cr;


    @Override
    public Course saveAndUpdateCourse(Course course) {
        if (course == null) {
            throw new NullPointerException("course is null");
        } else {
            return cr.saveAndUpdate(course);
        }

    }

    @Override
    public Boolean deleteCourse(Long id) {
        if (id == null) {
            throw new NullPointerException("course not found");
        } else {
            cr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Course> getAllCourses() {
        return cr.findAll();
    }
}

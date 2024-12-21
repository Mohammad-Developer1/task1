package ir.publications.task.Service;

import ir.publications.task.model.Course;

import java.util.List;

public interface CourseService {
    Course saveAndUpdateCourse(Course course);

    Boolean deleteCourse(Long id);

    List<Course> getAllCourses();



}

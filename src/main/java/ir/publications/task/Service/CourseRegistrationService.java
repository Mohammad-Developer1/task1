package ir.publications.task.Service;

import ir.publications.task.model.CourseRegistration;

import java.util.List;

public interface CourseRegistrationService {

    CourseRegistration registerCourse(CourseRegistration courseRegistration);

    Boolean deleteCourseRegistration(Long id);

    List<CourseRegistration> getAllCourseRegistrations();
}
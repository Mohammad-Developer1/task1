package ir.publications.task.Service.impl;

import ir.publications.task.Repository.CourseRegistrationRepository;
import ir.publications.task.Service.CourseRegistrationService;
import ir.publications.task.model.CourseRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseRegistrationServiceImpl implements CourseRegistrationService {

    @Autowired
    private CourseRegistrationRepository crr;

    public CourseRegistrationServiceImpl(CourseRegistrationRepository crr) {
        this.crr = crr;
    }


    @Override
    public CourseRegistration registerCourse(CourseRegistration courseRegistration) {
        if (courseRegistration == null) {
            throw new NullPointerException("Course registration is null");
        } else {
            return crr.saveAndUpdate(courseRegistration);
        }
    }

    @Override
    public Boolean deleteCourseRegistration(Long id) {
        if (id == null) {
            throw new NullPointerException("Course registration does not exist");
        } else {
            crr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<CourseRegistration> getAllCourseRegistrations() {
        return crr.findAll();
    }
}

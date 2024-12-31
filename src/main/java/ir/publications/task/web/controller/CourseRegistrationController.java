package ir.publications.task.web.controller;

import ir.publications.task.Service.CourseRegistrationService;
import ir.publications.task.model.CourseRegistration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/courseRegistration")
public class CourseRegistrationController {

    @Autowired
    private CourseRegistrationService crs;

    @PostMapping("/save_and_update_courseRegistration")
    public ResponseEntity<CourseRegistration> saveAndCourseRegistration(@RequestBody CourseRegistration courseRegistration) {
        crs.registerCourse(courseRegistration);
        return ResponseEntity.ok(courseRegistration);
    }

    @PostMapping("/delete_courseRegistration")
    public Boolean deleteCourseRegistration(Long id) {
        return crs.deleteCourseRegistration(id);
    }

    @GetMapping("/get_courseRegistration")
    public ResponseEntity<List<CourseRegistration>> getCourseRegistration() {
        List<CourseRegistration> all = crs.getAllCourseRegistrations();
        return ResponseEntity.ok(all);
    }

}

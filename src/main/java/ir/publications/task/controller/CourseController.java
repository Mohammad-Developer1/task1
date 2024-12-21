package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.model.ClassRoom;
import ir.publications.task.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @PostMapping("/save_and_update_course")
    public ResponseEntity<Course> saveAndUpdateCourse(@RequestBody Course course) {
        courseService.saveAndUpdateCourse(course);
        return ResponseEntity.ok(course);
    }

    @PostMapping("/delete_course")
    public Boolean deleteCourse(Long id) {
        return courseService.deleteCourse(id);
    }

    @GetMapping("/get_course")
    public ResponseEntity<List<Course>> getCourse() {
        List<Course> all = courseService.getAllCourses();
        return ResponseEntity.ok(all);
    }
}

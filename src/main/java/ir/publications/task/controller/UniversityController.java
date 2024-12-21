package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.Service.UniversityService;
import ir.publications.task.model.Course;
import ir.publications.task.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/university")
public class UniversityController {

    @Autowired
    private UniversityService universityService;


    @PostMapping("/save_and_update_university")
    public ResponseEntity<University> saveAndUpdateUniversity(@RequestBody University university) {
        universityService.saveAndUpdate(university);
        return ResponseEntity.ok(university);
    }

   @DeleteMapping("/delete_university")
    public Boolean deleteUniversity(Long id) {
        return universityService.deleteUniversity(id);
    }

    @GetMapping("/get_university")
    public ResponseEntity<List<University>> getUniversity() {
        List<University> all = universityService.findAll();
        return ResponseEntity.ok(all);
    }
}

package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.Service.SemesterService;
import ir.publications.task.model.Course;
import ir.publications.task.model.Semester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/semester")
public class SemesterController {
    @Autowired
    private SemesterService semesterService;


    @PostMapping("/save_and_update_semester")
    public ResponseEntity<Semester> saveAndUpdateSemester(@RequestBody Semester semester) {
        semesterService.saveAndUpdate(semester);
        return ResponseEntity.ok(semester);
    }

    @PostMapping("/delete_semester")
    public Boolean deleteSemester(Long id) {
        return semesterService.deleteSemester(id);
    }

    @GetMapping("/get_semester")
    public ResponseEntity<List<Semester>> getSemester() {
        List<Semester> all = semesterService.getAllSemesters();
        return ResponseEntity.ok(all);
    }
}

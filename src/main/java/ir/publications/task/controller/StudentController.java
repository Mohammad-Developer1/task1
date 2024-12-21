package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.Service.StudentService;
import ir.publications.task.model.Course;
import ir.publications.task.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/save_and_update_student")
    public ResponseEntity<Student> saveAndUpdateStudent(@RequestBody Student student) {
        studentService.saveAndUpdate(student);
        return ResponseEntity.ok(student);
    }

    @PostMapping("/delete_student")
    public Boolean deleteStudent(Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/get_student")
    public ResponseEntity<List<Student>> getStudent() {
        List<Student> all = studentService.getStudents();
        return ResponseEntity.ok(all);
    }
}

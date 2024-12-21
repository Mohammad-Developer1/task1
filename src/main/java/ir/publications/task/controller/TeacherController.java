package ir.publications.task.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.Service.TeacherService;
import ir.publications.task.model.Course;
import ir.publications.task.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/save_and_update_teacher")
    public ResponseEntity<Teacher> saveAndUpdateTeacher(@RequestBody Teacher teacher) {
        teacherService.saveAndUpdate(teacher);
        return ResponseEntity.ok(teacher);
    }

    @PostMapping("/delete_teacher")
    public Boolean deleteTeacher(Long id) {
        return teacherService.deleteTeacher(id);
    }

    @GetMapping("/get_teacher")
    public ResponseEntity<List<Teacher>> getTeacher() {
        List<Teacher> all = teacherService.getTeachers();
        return ResponseEntity.ok(all);
    }
}

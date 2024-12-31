package ir.publications.task.web.controller;

import ir.publications.task.Service.TeacherService;
import ir.publications.task.model.Teacher;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.TeacherViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;


    @PostMapping("/saveAndUpdateTeacher")
    @ResponseBody
    public Teacher saveAndUpdateTeacher(@RequestBody TeacherViewModel teacherViewModel) {
        return teacherService.saveAndUpdate(ModelMapper.map(teacherViewModel, Teacher.class));
    }

    @DeleteMapping("/deleteTeacher/{id}")
    @ResponseBody
    public Boolean deleteTeacher(@PathVariable Long id) {
        return teacherService.deleteTeacher(id);
    }

    @GetMapping("/getTeacher")
    @ResponseBody
    public List<TeacherViewModel>getTeacher() {
        return ModelMapper.mapList(teacherService.getTeachers(), TeacherViewModel.class);
    }
}

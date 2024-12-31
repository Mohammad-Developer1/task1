package ir.publications.task.web.controller;

import ir.publications.task.Service.StudentService;
import ir.publications.task.model.Student;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.StudentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;


    @PostMapping("/saveAndUpdateStudent")
    @ResponseBody
    public Student saveAndUpdateStudent(@RequestBody StudentViewModel studentViewModel) {
        return studentService.saveAndUpdate(ModelMapper.map(studentViewModel, Student.class));
    }

    @DeleteMapping("/deleteStudent/{id}")
    @ResponseBody
    public Boolean deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/getStudent")
    @ResponseBody
    public List<StudentViewModel> getStudent() {
        return ModelMapper.mapList(studentService.getStudents(), StudentViewModel.class);
    }
}

package ir.publications.task.web.controller;

import ir.publications.task.Service.CourseService;
import ir.publications.task.model.Course;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.CourseViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;


    @PostMapping("/saveAndUpdateCourse")
    @ResponseBody
    public Course saveAndUpdateCourse(@RequestBody CourseViewModel courseViewModel) {
        return courseService.saveAndUpdateCourse(ModelMapper.map(courseViewModel, Course.class));
    }

    @DeleteMapping("/deleteCourse/{id}")
    @ResponseBody
    public Boolean deleteCourse(@PathVariable Long id) {
        return courseService.deleteCourse(id);
    }

    @GetMapping("/getCourse")
    @ResponseBody
    public List<CourseViewModel> getCourse() {
        return ModelMapper.mapList(courseService.getAllCourses(), CourseViewModel.class);
    }
}

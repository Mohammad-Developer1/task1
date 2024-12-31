package ir.publications.task.web.controller;

import ir.publications.task.Service.CourseRegistrationService;
import ir.publications.task.model.CourseRegistration;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.CourseRegistrationViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/courseRegistration")
public class CourseRegistrationController {

    @Autowired
    private CourseRegistrationService crs;

    @PostMapping("/saveAndCourseRegistration")
    @ResponseBody
    public CourseRegistration saveAndCourseRegistration(@RequestBody CourseRegistrationViewModel courseRegistrationViewModel) {
        return crs.saveAndUpdate(ModelMapper.map(courseRegistrationViewModel, CourseRegistration.class));
    }

    @DeleteMapping("/deleteCourseRegistration/{id}")
    @ResponseBody
    public Boolean deleteCourseRegistration(@PathVariable Long id) {
        return crs.deleteCourseRegistration(id);
    }

    @GetMapping("/getCourseRegistration")
    @ResponseBody
    public List<CourseRegistrationViewModel> getCourseRegistration() {
        return ModelMapper.mapList(crs.getAllCourseRegistrations(),CourseRegistrationViewModel.class);
    }

}

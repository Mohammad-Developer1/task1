package ir.publications.task.web.controller;

import ir.publications.task.Service.SemesterService;
import ir.publications.task.model.Semester;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.SemesterViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/semester")
public class SemesterController {
    @Autowired
    private SemesterService semesterService;


    @PostMapping("/saveAndUpdateSemester")
    @ResponseBody
    public Semester saveAndUpdateSemester(@RequestBody SemesterViewModel semesterViewModel) {
        return semesterService.saveAndUpdate(ModelMapper.map(semesterViewModel, Semester.class));
    }

    @DeleteMapping("/deleteSemester/{id}")
    @ResponseBody
    public Boolean deleteSemester(@PathVariable Long id) {
        return semesterService.deleteSemester(id);
    }

    @GetMapping("/getSemester")
    @ResponseBody
    public List<SemesterViewModel> getSemester() {
        return ModelMapper.mapList(semesterService.getAllSemesters(), SemesterViewModel.class);
    }
}

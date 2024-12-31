package ir.publications.task.web.controller;

import ir.publications.task.Service.UniversityService;
import ir.publications.task.model.University;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.TeacherViewModel;
import ir.publications.task.web.viewModel.UniversityViewModel;
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


    @PostMapping("/saveAndUpdateUniversity")
    @ResponseBody
    public University saveAndUpdateUniversity(@RequestBody UniversityViewModel universityViewModel) {
        return universityService.saveAndUpdate(ModelMapper.map(universityViewModel,University.class));
    }

   @DeleteMapping("/deleteUniversity/{id}")
   @ResponseBody
    public Boolean deleteUniversity(@PathVariable Long id) {
        return universityService.deleteUniversity(id);
    }

    @GetMapping("/getUniversity")
    @ResponseBody
    public List<UniversityViewModel> getUniversity() {
       return ModelMapper.mapList(universityService.findAll(), UniversityViewModel.class);
    }
}

package ir.publications.task.web.controller;

import ir.publications.task.Repository.MajorRepository;
import ir.publications.task.Service.MajorService;
import ir.publications.task.model.Major;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.MajorViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/Major")
public class MajorController {

    @Autowired
    private MajorService majorService;


    @PostMapping("/saveAndUpdateMajor")
    @ResponseBody
    public Major saveAndUpdateMajor(@RequestBody MajorViewModel majorViewModel) {
        return majorService.saveAndUpdateMajor(ModelMapper.map(majorViewModel, Major.class));
    }

    @DeleteMapping("/deleteMajor/{id}")
    @ResponseBody
    public Boolean deleteMajor(@PathVariable Long id) {
        return majorService.deleteMajor(id);
    }

    @GetMapping("/getMajor")
    @ResponseBody
    public List<MajorViewModel> getMajor() {
        return ModelMapper.mapList(majorService.getMajors(), MajorViewModel.class);
    }
}

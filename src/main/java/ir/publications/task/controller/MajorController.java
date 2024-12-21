package ir.publications.task.controller;

import ir.publications.task.Service.MajorService;
import ir.publications.task.model.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/Major")
public class MajorController {

    @Autowired
    private MajorService majorService;


    @PostMapping("/save_and_update_Major")
    public ResponseEntity<Major> saveAndUpdateMajor(@RequestBody Major major) {
        majorService.saveAndUpdateMajor(major);
        return ResponseEntity.ok(major);
    }

    @PostMapping("/delete_Major")
    public Boolean deleteMajor(Long id) {
        return majorService.deleteMajor(id);
    }

    @GetMapping("/get_Major")
    public ResponseEntity<List<Major>> getMajor() {
        List<Major> all = majorService.getMajors();
        return ResponseEntity.ok(all);
    }
}

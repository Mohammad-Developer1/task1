package ir.publications.task.controller;

import ir.publications.task.Service.BaseInformationService;
import ir.publications.task.model.baseModel.BaseInformation;
import ir.publications.task.model.baseModel.BaseInformationHed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/BaseInformation")
public class BaseInformationController {

    @Autowired
    private BaseInformationService bis;


    @PostMapping("/save_and_update_BaseInformation")
    public ResponseEntity<BaseInformation> saveAndUpdateBaseInformation(@RequestBody BaseInformation baseInformation) {
        bis.saveAndUpdateBaseInfo(baseInformation);
        return ResponseEntity.ok(baseInformation);
    }

    @PostMapping("/delete_BaseInformation")
    public Boolean deleteBaseInformation(Long id) {
        return bis.deleteBaseInformation(id);
    }

    @GetMapping("/get_BaseInformation")
    public ResponseEntity<List<BaseInformation>> getBaseInformation() {
        List<BaseInformation> all = bis.getBaseInformation();
        return ResponseEntity.ok(all);
    }


}

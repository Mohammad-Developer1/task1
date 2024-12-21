package ir.publications.task.controller;

import ir.publications.task.Service.BaseInformationHedService;
import ir.publications.task.model.baseModel.BaseInformationHed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/BaseInformationHed")
public class BaseInformationHedController {

    @Autowired
    private BaseInformationHedService bis;

    @PostMapping("/save_and_update_BaseInformationHed")
    public ResponseEntity<BaseInformationHed> saveAndUpdateBaseInformationHed(@RequestBody BaseInformationHed baseInformationHed) {
        bis.saveAndUpdateBaseInformationHedRepository(baseInformationHed);
        return ResponseEntity.ok(baseInformationHed);
    }

    @ResponseBody
    @DeleteMapping("/delete_BaseInformationHed/{id}")
    public Boolean deleteBaseInformationHed(@PathVariable Long id) {
        return bis.deleteBaseInformationHedRepository(id);
    }


    @GetMapping("/get_BaseInformationHed")
    public ResponseEntity<List<BaseInformationHed>> getBaseInformationHed() {
        List<BaseInformationHed> all = bis.getBaseInformationHedRepository();
        return ResponseEntity.ok(all);
    }


}

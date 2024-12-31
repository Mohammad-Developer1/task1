package ir.publications.task.web.controller;

import ch.qos.logback.core.model.Model;
import ir.publications.task.Service.BaseInformationHedService;
import ir.publications.task.model.baseModel.BaseInformationHed;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.BaseInformationHedViewModel;
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

    @PostMapping("/saveAndUpdateBaseInformationHed")
    @ResponseBody
    public BaseInformationHed saveAndUpdateBaseInformationHed(@RequestBody BaseInformationHedViewModel baseInformationHedViewModel) {
      return  bis.saveAndUpdateBaseInformationHedRepository(ModelMapper.map(baseInformationHedViewModel, BaseInformationHed.class));
    }


    @DeleteMapping("/deleteBaseInformationHed/{id}")
    @ResponseBody
    public Boolean deleteBaseInformationHed(@PathVariable Long id) {
        return bis.deleteBaseInformationHedRepository(id);
    }


    @GetMapping("/getBaseInformationHed")
    public List<BaseInformationHedViewModel> getBaseInformationHed() {
        return ModelMapper.mapList(bis.getBaseInformationHedRepository(), BaseInformationHedViewModel.class);
    }


}

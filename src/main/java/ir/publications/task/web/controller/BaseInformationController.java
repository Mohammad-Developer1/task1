package ir.publications.task.web.controller;

import ir.publications.task.Service.BaseInformationService;
import ir.publications.task.model.baseModel.BaseInformation;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.BaseInformationViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/BaseInformation")
public class BaseInformationController {


    @Autowired
    BaseInformationService baseInformationService;


    @PostMapping("/save_and_update_BaseInformation")
    @ResponseBody
    public BaseInformation saveAndUpdateBaseInformation(@RequestBody BaseInformationViewModel baseInformationViewModel) {
        return baseInformationService.saveAndUpdateBaseInfo(ModelMapper.map(baseInformationViewModel, BaseInformation.class));
    }

    @DeleteMapping("/delete_BaseInformation/{id}")
    @ResponseBody
    public Boolean deleteBaseInformation(@PathVariable  Long id) {
        return baseInformationService.deleteBaseInformation(id);
    }

    @GetMapping("/get_BaseInformation")
    @ResponseBody
    public List<BaseInformationViewModel> getBaseInformation() {
        return ModelMapper.mapList(baseInformationService.getBaseInformation(), BaseInformationViewModel.class);
    }


}

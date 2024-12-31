package ir.publications.task.web.controller;

import ir.publications.task.Service.DepartmentService;
import ir.publications.task.model.Department;
import ir.publications.task.util.mapper.ModelMapper;
import ir.publications.task.web.viewModel.DepartmentViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/saveAndUpdateDepartment")
    @ResponseBody
    public Department saveAndUpdateDepartment(@RequestBody DepartmentViewModel departmentViewModel) {
        return departmentService.saveAndUpdateDepartment(ModelMapper.map(departmentViewModel, Department.class));
    }

    @DeleteMapping("/deleteDepartment/{id}")
    @ResponseBody
    public Boolean deleteDepartment(@PathVariable Long id) {
        return departmentService.deleteDepartment(id);
    }

    @GetMapping("/getDepartment")
    @ResponseBody
    public List<DepartmentViewModel> getDepartment() {
        return ModelMapper.mapList(departmentService.getAllDepartments(), DepartmentViewModel.class);
    }
}

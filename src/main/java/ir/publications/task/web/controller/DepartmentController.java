package ir.publications.task.web.controller;

import ir.publications.task.Service.DepartmentService;
import ir.publications.task.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save_and_update_department")
    public ResponseEntity<Department> saveAndUpdateDepartment(@RequestBody Department department) {
        departmentService.saveAndUpdateDepartment(department);
        return ResponseEntity.ok(department);
    }

    @PostMapping("/delete_department")
    public Boolean deleteDepartment(Long id) {
        return departmentService.deleteDepartment(id);
    }

    @GetMapping("/get_department")
    public ResponseEntity<List<Department>> getDepartment() {
        List<Department> all = departmentService.getAllDepartments();
        return ResponseEntity.ok(all);
    }
}

package ir.publications.task.Service.impl;

import ir.publications.task.Repository.DepartmentRepository;
import ir.publications.task.Service.DepartmentService;
import ir.publications.task.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository dr;

    public DepartmentServiceImpl(DepartmentRepository dr) {
        this.dr = dr;
    }

    @Override
    public Department saveAndUpdateDepartment(Department department) {
        if (department == null) {
            throw new NullPointerException("department is null");
        }else {
            return dr.saveAndUpdate(department);
        }
    }

    @Override
    public Boolean deleteDepartment(Long id) {
        if (id == null) {
            throw new NullPointerException("department is null");
        }else {
            dr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Department> getAllDepartments() {
        return dr.findAll();
    }
}

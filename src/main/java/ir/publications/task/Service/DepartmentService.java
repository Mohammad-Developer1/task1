package ir.publications.task.Service;

import ir.publications.task.model.Department;

import java.util.List;

public interface DepartmentService {
    Department saveAndUpdateDepartment(Department department);

    Boolean deleteDepartment(Long id);

    List<Department> getAllDepartments();
}

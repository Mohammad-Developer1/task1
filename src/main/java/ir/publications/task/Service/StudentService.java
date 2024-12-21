package ir.publications.task.Service;

import ir.publications.task.model.Student;

import java.util.List;

public interface StudentService {
    Student saveAndUpdate(Student student);

    Boolean deleteStudent(Long id);

    List<Student> getStudents();
}

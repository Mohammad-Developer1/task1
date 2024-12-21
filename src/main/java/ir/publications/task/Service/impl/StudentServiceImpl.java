package ir.publications.task.Service.impl;

import ir.publications.task.Repository.StudentRepository;
import ir.publications.task.Service.StudentService;
import ir.publications.task.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository sr;

    public StudentServiceImpl(StudentRepository sr) {
        this.sr = sr;
    }


    @Override
    public Student saveAndUpdate(Student student) {
        if (student == null) {
            throw new NullPointerException("student id is null");
        }else {
            return sr.saveAndUpdate(student);
        }
    }

    @Override
    public Boolean deleteStudent(Long id) {
        if(id == null) {
            throw new NullPointerException("student id is null");
        }else {
            sr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Student> getStudents() {
        return sr.findAll();
    }
}

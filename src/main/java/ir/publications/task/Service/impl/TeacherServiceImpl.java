package ir.publications.task.Service.impl;

import ir.publications.task.Repository.TeacherRepository;
import ir.publications.task.Service.TeacherService;
import ir.publications.task.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherRepository tr;

    public TeacherServiceImpl(TeacherRepository tr) {
        this.tr = tr;
    }


    @Override
    public Teacher saveAndUpdate(Teacher teacher) {
        if(teacher == null){
            throw new NullPointerException("teacher is null");
        }else {
            return tr.saveAndUpdate(teacher);
        }
    }

    @Override
    public Boolean deleteTeacher(Long id) {
        if(id==null){
            throw new NullPointerException("teacher is null");
        }else {
            tr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Teacher> getTeachers() {
        return tr.findAll();
    }
}

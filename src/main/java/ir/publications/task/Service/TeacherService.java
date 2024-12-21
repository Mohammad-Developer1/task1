package ir.publications.task.Service;

import ir.publications.task.model.Teacher;

import java.util.List;

public interface TeacherService {
    Teacher saveAndUpdate(Teacher teacher);

    Boolean deleteTeacher(Long id);

    List<Teacher> getTeachers();

}

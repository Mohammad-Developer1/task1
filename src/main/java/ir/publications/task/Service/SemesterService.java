package ir.publications.task.Service;

import ir.publications.task.model.Semester;

import java.util.List;

public interface SemesterService {

    Semester saveAndUpdate(Semester semester);

    Boolean deleteSemester(Long id);

    List<Semester> getAllSemesters();
}

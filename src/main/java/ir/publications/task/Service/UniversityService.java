package ir.publications.task.Service;


import ir.publications.task.model.University;

import java.util.List;

public interface UniversityService {

    University saveAndUpdate(University university);

    Boolean deleteUniversity(Long id);

    List<University> findAll();
}

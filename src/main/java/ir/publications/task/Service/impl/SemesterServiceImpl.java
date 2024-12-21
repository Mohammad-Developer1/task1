package ir.publications.task.Service.impl;

import ir.publications.task.Repository.SemesterRepository;
import ir.publications.task.Service.SemesterService;
import ir.publications.task.model.Semester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterServiceImpl implements SemesterService {

    @Autowired
    private SemesterRepository sr;

    public SemesterServiceImpl(SemesterRepository sr) {
        this.sr = sr;
    }


    @Override
    public Semester saveAndUpdate(Semester semester) {
        if (semester == null) {
            throw new NullPointerException("semester id is null");
        } else {
            return sr.saveAndUpdate(semester);
        }

    }

    @Override
    public Boolean deleteSemester(Long id) {
        if (id == null) {
            throw new NullPointerException("semester id is null");
        } else {
            sr.deleteById(id);
        }
        return null;
    }

    @Override
    public List<Semester> getAllSemesters() {
        return sr.findAll();
    }
}

package ir.publications.task.Service.impl;

import ir.publications.task.Repository.UniversityRepository;
import ir.publications.task.Service.UniversityService;
import ir.publications.task.model.University;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityServiceImpl implements UniversityService {

    @Autowired
    private UniversityRepository ur;

    public UniversityServiceImpl(UniversityRepository ur) {
        this.ur = ur;
    }

    @Override
    public University saveAndUpdate(University university) {
        if (university == null) {
            throw new NullPointerException("university is null");
        } else {
            return ur.saveAndUpdate(university);
        }
    }

    @Override
    public Boolean deleteUniversity(Long id) {
        if (id == null) {
            throw new NullPointerException("university is null");
        } else {
            ur.deleteById(id);
        }
        return null;
    }

    @Override
    public List<University> findAll() {
        return ur.findAll();
    }
}

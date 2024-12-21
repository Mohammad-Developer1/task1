package ir.publications.task.Service.impl;

import ir.publications.task.Repository.MajorRepository;
import ir.publications.task.Service.MajorService;
import ir.publications.task.model.Major;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {

    @Autowired
    private MajorRepository mr;

    public MajorServiceImpl(MajorRepository mr) {
        this.mr = mr;
    }

    @Override
    public Major saveAndUpdateMajor(Major major) {
       if (major == null){
           throw new NullPointerException("Major is null");
       }else {
           return mr.saveAndUpdate(major);
       }
    }

    @Override
    public Boolean deleteMajor(Long id) {
        return null;
    }

    @Override
    public List<Major> getMajors() {
        return List.of();
    }
}

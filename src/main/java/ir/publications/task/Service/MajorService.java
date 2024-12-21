package ir.publications.task.Service;

import ir.publications.task.model.Major;

import java.util.List;

public interface MajorService {
    Major saveAndUpdateMajor(Major major);

    Boolean deleteMajor(Long id);

    List<Major> getMajors();
}

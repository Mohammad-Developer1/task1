package ir.publications.task.Service.impl;

import ir.publications.task.Repository.BaseInformationRepository;
import ir.publications.task.Service.BaseInformationService;
import ir.publications.task.model.baseModel.BaseInformation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInformationServiceImpl implements BaseInformationService {

    @Autowired
    private BaseInformationRepository bir;

    public BaseInformationServiceImpl(BaseInformationRepository bir) {
        this.bir = bir;
    }

    @Override
    public BaseInformation saveAndUpdateBaseInfo(BaseInformation baseInformation) {
        if (baseInformation == null) {
            throw new NullPointerException("baseInformation is null");
        } else {
            return bir.saveAndUpdate(baseInformation);
        }
    }

    @Override
    public Boolean deleteBaseInformation(Long id) {
        if (id == null) {
            throw new NullPointerException("id is null");
        }else {
            bir.deleteById(id);
        }
        return null;
    }

    @Override
    public List<BaseInformation> getBaseInformation() {
        return bir.findAll();
    }
}

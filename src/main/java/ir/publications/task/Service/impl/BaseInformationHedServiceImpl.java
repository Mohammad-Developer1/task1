package ir.publications.task.Service.impl;

import ir.publications.task.Repository.BaseInformationHedRepository;
import ir.publications.task.Service.BaseInformationHedService;
import ir.publications.task.model.baseModel.BaseInformationHed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseInformationHedServiceImpl implements BaseInformationHedService {

    @Autowired
    private BaseInformationHedRepository bir;

    public BaseInformationHedServiceImpl(BaseInformationHedRepository bir) {
        this.bir = bir;
    }


    @Override
    public BaseInformationHed saveAndUpdateBaseInformationHedRepository(BaseInformationHed bi) {
        if (bi == null) {
            throw new NullPointerException("baseInformationHed is null");
        } else {
            return bir.saveAndUpdate(bi);
        }
    }

    @Override
    public List<BaseInformationHed> getBaseInformationHedRepository() {
        return bir.findAll();
    }

    @Override
    public Boolean deleteBaseInformationHedRepository(Long id) {
        if (id == null) {
            throw new NullPointerException("id is null");
        } else {
            bir.deleteById(id);
        }
        return null;
    }


}

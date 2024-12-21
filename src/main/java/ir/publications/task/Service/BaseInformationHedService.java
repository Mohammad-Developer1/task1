package ir.publications.task.Service;

import ir.publications.task.model.baseModel.BaseInformationHed;

import java.util.List;

public interface BaseInformationHedService {

    BaseInformationHed saveAndUpdateBaseInformationHedRepository(BaseInformationHed bi);

    List<BaseInformationHed> getBaseInformationHedRepository();

    Boolean deleteBaseInformationHedRepository(Long id);
}

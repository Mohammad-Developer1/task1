package ir.publications.task.Service;

import ir.publications.task.model.baseModel.BaseInformation;

import java.util.List;

public interface BaseInformationService {

    BaseInformation saveAndUpdateBaseInfo(BaseInformation baseInformation);

    Boolean deleteBaseInformation(Long id);

    List<BaseInformation> getBaseInformation();
}

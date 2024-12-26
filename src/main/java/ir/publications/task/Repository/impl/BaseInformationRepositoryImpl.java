package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.BaseInformationRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.baseModel.BaseInformation;
import org.springframework.stereotype.Repository;

@Repository
public class BaseInformationRepositoryImpl extends BaseRepositoryImpl<BaseInformation,Long> implements BaseInformationRepository {


    @Override
    public Class<BaseInformation> getEntityClass() {
        return BaseInformation.class;
    }
}

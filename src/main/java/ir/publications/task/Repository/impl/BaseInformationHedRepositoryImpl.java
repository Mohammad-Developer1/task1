package ir.publications.task.Repository.impl;

import ir.publications.task.Repository.BaseInformationHedRepository;
import ir.publications.task.Repository.base.impl.BaseRepositoryImpl;
import ir.publications.task.model.baseModel.BaseInformationHed;
import org.springframework.stereotype.Repository;

@Repository
public class BaseInformationHedRepositoryImpl extends BaseRepositoryImpl<BaseInformationHed,Long> implements BaseInformationHedRepository {
    @Override
    public Class<BaseInformationHed> getEntityClass() {
        return BaseInformationHed.class;
    }
}

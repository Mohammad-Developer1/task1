package ir.publications.task.Repository;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.baseModel.BaseInformation;
import ir.publications.task.model.baseModel.BaseInformationHed;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseInformationRepository extends BaseRepository<BaseInformation, Long> {


}

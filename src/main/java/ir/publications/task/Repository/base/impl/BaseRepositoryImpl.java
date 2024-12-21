package ir.publications.task.Repository.base.impl;

import ir.publications.task.Repository.base.BaseRepository;
import ir.publications.task.model.baseModel.BaseInformation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
@Transactional
public class BaseRepositoryImpl<T ,ID> implements BaseRepository<T, ID> {

    @PersistenceContext
    private EntityManager entityManager;

    private final Class<T> entityClass;

    public BaseRepositoryImpl(EntityManager entityManager, Class<T> entityClass) {
        this.entityManager = entityManager;
        this.entityClass = entityClass;
    }

    @Override
    @Transactional
    public T saveAndUpdate(T t) {
        if (t == null) {
            throw new IllegalArgumentException("Entity cannot be null");
        }
        if (entityManager.contains(t)) {
            entityManager.merge(t);
        } else {
            entityManager.persist(t);
        }
        return t;
    }

    @Override
    @Transactional
    public Boolean deleteById(ID id) {
        T entity = findById(id);
        if (entity != null) {
            entityManager.remove(entity);
            return true;
        }
        return false;
    }

    @Override
    public List<T> findAll() {
        return entityManager.createQuery("SELECT e FROM " + entityClass.getSimpleName() + " e", entityClass)
                .getResultList();
    }
    @Override
    public T findById(ID id) {
        return entityManager.find(entityClass, id);
    }

}

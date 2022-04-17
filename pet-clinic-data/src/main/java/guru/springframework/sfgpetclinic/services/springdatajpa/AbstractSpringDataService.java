package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.BaseEntity;
import guru.springframework.sfgpetclinic.services.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractSpringDataService<T extends BaseEntity, R extends JpaRepository<T, Long>> implements CrudService<T> {

    protected R repository;

    public AbstractSpringDataService(R repository) {
        this.repository = repository;
    }

    @Override
    public Set<T> findAll() {
        return new HashSet<>(repository.findAll());
    }

    @Override
    public T findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public T save(T object) {
        return repository.save(object);
    }

    @Override
    public void delete(T object) {
        repository.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }

}
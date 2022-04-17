package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.Specialty;
import guru.springframework.sfgpetclinic.repositories.SpecialtyRepository;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class SpecialtySpringDataService extends AbstractSpringDataService<Specialty, SpecialtyRepository> implements SpecialtiesService {
    public SpecialtySpringDataService(SpecialtyRepository repository) {
        super(repository);
    }
}

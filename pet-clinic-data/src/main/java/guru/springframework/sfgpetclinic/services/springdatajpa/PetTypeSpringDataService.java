package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.PetType;
import guru.springframework.sfgpetclinic.repositories.PetTypeRepository;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetTypeSpringDataService extends AbstractSpringDataService<PetType, PetTypeRepository> implements PetTypeService {
    public PetTypeSpringDataService(PetTypeRepository repository) {
        super(repository);
    }
}

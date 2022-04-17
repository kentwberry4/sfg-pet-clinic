package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.Owner;
import guru.springframework.sfgpetclinic.repositories.OwnerRepository;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class OwnerSpringDataService extends AbstractSpringDataService<Owner, OwnerRepository> implements OwnerService {

    public OwnerSpringDataService(OwnerRepository repository) {
        super(repository);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return repository.findByLastName(lastName);
    }

    @Override
    public Owner findByLastNameWithPets(String lastName) {
        return repository.findByLastNameWithPets(lastName);
    }

}

package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.Pet;
import guru.springframework.sfgpetclinic.repositories.PetRepository;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class PetSpringDataService extends AbstractSpringDataService<Pet, PetRepository> implements PetService {
    public PetSpringDataService(PetRepository repository) {
        super(repository);
    }
}

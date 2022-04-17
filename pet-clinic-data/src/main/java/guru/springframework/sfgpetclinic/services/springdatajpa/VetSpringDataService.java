package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.repositories.VetRepository;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class VetSpringDataService extends AbstractSpringDataService<Vet, VetRepository> implements VetService {
    public VetSpringDataService(VetRepository repository) {
        super(repository);
    }
}

package guru.springframework.sfgpetclinic.services.springdatajpa;

import guru.springframework.sfgpetclinic.models.Visit;
import guru.springframework.sfgpetclinic.repositories.VisitRepository;
import guru.springframework.sfgpetclinic.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Profile("jpa")
@Transactional
public class VisitSpringDataService extends AbstractSpringDataService<Visit, VisitRepository> implements VisitService {
    public VisitSpringDataService(VisitRepository repository) {
        super(repository);
    }
}

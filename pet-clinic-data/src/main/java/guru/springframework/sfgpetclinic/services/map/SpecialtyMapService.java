package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Specialty;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class SpecialtyMapService extends AbstractMapService<Specialty> implements SpecialtiesService {
}

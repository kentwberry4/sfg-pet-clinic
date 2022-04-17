package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class VetMapService extends AbstractMapService<Vet> implements VetService {

    private SpecialtiesService specialtiesService;

    public VetMapService(SpecialtiesService specialtiesService) {
        this.specialtiesService = specialtiesService;
    }

    @Override
    public Vet save(Vet object) {
        object.getSpecialties().forEach(speciality -> {
            if (speciality.getId() == null) {
                specialtiesService.save(speciality);
            }
        });
        return super.save(object);
    }
}

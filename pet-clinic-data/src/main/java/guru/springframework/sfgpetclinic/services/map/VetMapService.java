package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Specialty;
import guru.springframework.sfgpetclinic.models.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtiesService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialtiesService specialtiesService;

    public VetMapService(SpecialtiesService specialtiesService) {
        this.specialtiesService = specialtiesService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet visit) {

        if (visit.getSpecialties().size() > 0){
            visit.getSpecialties().forEach(speciality -> {
                if(speciality.getId() == null){
                    Specialty savedSpecialty = specialtiesService.save(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(visit);
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }
}

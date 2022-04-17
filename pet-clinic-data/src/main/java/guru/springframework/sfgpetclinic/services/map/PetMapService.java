package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Pet;
import guru.springframework.sfgpetclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet> implements PetService {

}

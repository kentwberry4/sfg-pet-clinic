package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save (Pet owner);

    Set<Pet> findAll();
}

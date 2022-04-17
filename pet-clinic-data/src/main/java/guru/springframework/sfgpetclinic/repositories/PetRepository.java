package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}

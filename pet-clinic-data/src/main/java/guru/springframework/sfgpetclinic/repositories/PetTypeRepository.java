package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.models.PetType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetTypeRepository extends JpaRepository<PetType, Long> {
}

package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.models.Specialty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialtyRepository extends JpaRepository<Specialty, Long> {
}

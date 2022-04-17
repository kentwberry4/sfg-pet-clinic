package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.models.Vet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VetRepository extends JpaRepository<Vet, Long> {
}

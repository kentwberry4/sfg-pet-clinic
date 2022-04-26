package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Owner;

import java.util.List;

public interface OwnerService extends CrudService<Owner> {

    Owner findByLastName(String lastName);

    Owner findByLastNameWithPets(String lastName);

    List<Owner> findAllByLastNameLike(String lastName);
}

package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.models.Owner;

public interface OwnerService extends CrudService<Owner> {

    Owner findByLastName(String lastName);

    Owner findByLastNameWithPets(String lastName);

    Object findAllByLastNameLike(String anyString);
}

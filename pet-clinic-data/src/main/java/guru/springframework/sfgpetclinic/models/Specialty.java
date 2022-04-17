package guru.springframework.sfgpetclinic.models;

import lombok.*;

import javax.persistence.Entity;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Specialty extends BaseEntity {
    private String description;
}

package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;
import org.ecofriendly.enumeration.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String surname;
    private String fatherName;
    private LocalDate birthDate;
    private Gender gender;
    @OneToMany
    private Set<Email> email;
    @OneToMany
    private Set<Phone> phone;
}

package org.ecofriendly.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;
import org.ecofriendly.enumeration.Gender;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {
    @Id
    private Long   user_id;
    private String name;
    private String surname;
    private String fatherName;
    private LocalDate birthDate;
    private Gender gender;
    @OneToMany
    private Set<Email> email;
    @OneToMany
    private Set<Phone> phone;
    private String password;
}

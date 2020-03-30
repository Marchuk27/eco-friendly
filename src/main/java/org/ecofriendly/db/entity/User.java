package org.ecofriendly.db.entity;

import org.ecofriendly.db.handbooks.Email;
import org.ecofriendly.db.handbooks.Phone;
import org.ecofriendly.enumeration.Gender;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long   id;
    private String firstName;
    private String lastName;
    private String middleName;
    private LocalDate birthDate;
    private Gender gender;
    @OneToMany
    private Set<Email> email;
    @OneToMany
    private Set<Phone> phone;
    private String password;
}

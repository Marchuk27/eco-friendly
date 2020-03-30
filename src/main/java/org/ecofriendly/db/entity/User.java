package org.ecofriendly.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.enumeration.Gender;
import org.hibernate.annotations.Table;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String fatherName;
    private LocalDate birthDate;
    private Gender gender;
    private String email;
    private String password;
}

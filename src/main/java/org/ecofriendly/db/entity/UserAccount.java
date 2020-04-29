package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class UserAccount  {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String firstName;
    private String surname;
    private String fatherName;
    private Date dateOfBirth;

    private boolean isMan;
    private String email;
    private String password;
    @Transient
    private String repeatPassword;
}

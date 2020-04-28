package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.Collection;

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

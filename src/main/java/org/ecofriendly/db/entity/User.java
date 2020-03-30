package org.ecofriendly.db.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.enumeration.Months;

@Getter
@Setter
@AllArgsConstructor
public class User {
    private String name;
    private String surname;
    private String fatherName;
    private int dayOfBirth;
    private Months monthOfBirth;
    private int yearOfBirth;
    private boolean isMan;
    private String email;
    private String password;
}

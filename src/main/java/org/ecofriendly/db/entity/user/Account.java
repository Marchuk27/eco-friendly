package org.ecofriendly.db.entity.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
public class Account implements UserDetails {
    @Id
    @Length(min = 6)
    private String username; //case sensitive, userName - no go

    private String    firstName;
    private String    lastName;
    private String    middleName;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate dateOfBirth;
    @Length(max = 1)
    private String    sex;
    private String    email;

    @OneToOne
    @JsonBackReference
    private Tracker   tracker;
    @OneToOne
    @JsonBackReference
    private CheckList checkList;
    @ElementCollection
    private List<Short> achievementList; //в списке будут храниться id достижений пользователя

    @NotNull
    @Length(min = 6)
    @JsonIgnore
    private String         password;
    @Transient
    private String         repeatPassword;
    private boolean        enabled;
    @ManyToMany
    private Set<Authority> authority;

    //поля для достижений
    //@ManyToMany - одна ачивка может быть у нескольких пользователей
    //private Set<Achievement> achievementList;
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getAuthority();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }

}

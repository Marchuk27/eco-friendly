package org.ecofriendly.db.entity.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.CheckList;
import org.ecofriendly.db.entity.Tracker;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.util.CollectionUtils;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.ArrayList;
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
    private List<Integer> achievementList; //в списке будут храниться id достижений пользователя

    @NotNull
    @Length(min = 6)
    private String         password;
    @Transient
    private String         repeatPassword;
    private boolean        enabled;
    @ManyToMany
    private Set<Authority> authority;

    public List<Integer> getAchievementList() {
        if (CollectionUtils.isEmpty(achievementList)) {
            return new ArrayList<>();
        }
        return achievementList;
    }


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

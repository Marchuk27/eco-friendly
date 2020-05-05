package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.db.entity.user.Account;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class CheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long    id;
    @OneToOne
    private Account account;

    @Transient
    private String ideaInput;
    //закрепленные идеи в чеклисте
    @ElementCollection
    private List<String> savedIdeas;
}

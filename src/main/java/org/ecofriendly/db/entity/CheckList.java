package org.ecofriendly.db.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//@Entity
@Getter
@Setter
public class CheckList {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private UserAccount userAccount;

    @Transient
    private String ideaInput;
    //закрепленные идеи в чеклисте
    private List<String> savedIdeas;
}

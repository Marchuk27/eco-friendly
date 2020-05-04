package org.ecofriendly.db.entity.company;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Getter
@Setter
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String textContent;
    private String urlToImage;
    private Date dateOfPublish;
    private Integer likeAmount;
}

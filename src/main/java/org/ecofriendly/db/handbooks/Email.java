package org.ecofriendly.db.handbooks;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email;
}

package org.ecofriendly.db.handbooks;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "e_mails")
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

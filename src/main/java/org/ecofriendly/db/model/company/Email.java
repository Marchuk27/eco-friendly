package org.ecofriendly.db.model.company;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String email;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

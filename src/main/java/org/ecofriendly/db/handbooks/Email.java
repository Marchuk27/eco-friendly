package org.ecofriendly.db.handbooks;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

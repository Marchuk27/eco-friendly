package org.ecofriendly.db.model.company;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phone;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

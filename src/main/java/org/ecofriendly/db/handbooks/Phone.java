package org.ecofriendly.db.handbooks;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "phones")
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phone;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

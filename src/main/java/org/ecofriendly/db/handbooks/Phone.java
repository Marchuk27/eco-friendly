package org.ecofriendly.db.handbooks;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String phone;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

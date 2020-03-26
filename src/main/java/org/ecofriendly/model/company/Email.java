package org.ecofriendly.model.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.model.Company;

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

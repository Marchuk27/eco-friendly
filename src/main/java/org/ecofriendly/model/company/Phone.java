package org.ecofriendly.model.company;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;
import org.ecofriendly.model.Company;

import javax.persistence.*;
import java.util.Set;

@Entity @Setter @Getter
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phone;
	/*@ManyToOne
	@JsonIgnore
	private Company company;*/
}

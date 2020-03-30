package org.ecofriendly.db.handbooks;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Phone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String phone;
}

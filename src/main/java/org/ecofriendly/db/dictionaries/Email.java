package org.ecofriendly.db.dictionaries;

import lombok.Data;
import org.ecofriendly.enumeration.LegalAttachment;

import javax.persistence.*;

@Entity
@Data
public class Email {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String email;
	private LegalAttachment attachment;
}

package org.ecofriendly.service;

import org.ecofriendly.model.Company;

public interface CompanyService {
	Company findByEntity(String entity);
}

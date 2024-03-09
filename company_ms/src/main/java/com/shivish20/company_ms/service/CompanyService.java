package com.shivish20.company_ms.service;

import com.shivish20.company_ms.model.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    Company updateCompanyById(Long id, Company company);

    boolean addCompanies(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}

package com.shivish20.company_ms.service;

import com.shivish20.company_ms.model.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    void updateCompanyById(Long id, Company company);

    void addCompanies(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompanyById(Long id);
}

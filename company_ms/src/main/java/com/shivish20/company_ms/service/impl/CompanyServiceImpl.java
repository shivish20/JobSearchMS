package com.shivish20.company_ms.service.impl;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.repository.CompanyRepository;
import com.shivish20.company_ms.service.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public void updateCompanyById(Long id, Company company) {
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if (optionalCompany.isPresent()) {
            Company companyUpdate = optionalCompany.get();
            companyUpdate.setName(company.getName());
            companyUpdate.setDescription(company.getDescription());
            companyRepository.save(companyUpdate);
        }
    }

    @Override
    public void addCompanies(Company company) {
        if (company != null) {
            companyRepository.save(company);
        }
    }

    @Override
    public boolean deleteCompanyById(Long id) {
        if (companyRepository.existsById(id)) {
            companyRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public Company getCompanyById(Long id) {

        return companyRepository.findById(id).orElse(null);
    }
}

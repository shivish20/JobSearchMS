package com.shivish20.company_ms.service.impl;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.repository.CompanyRepository;
import com.shivish20.company_ms.service.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CompanyServiceImpl implements CompanyService {
    private final CompanyRepository companyRepository;

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }

    @Override
    public Company updateCompanyById(Long id, Company company) {
        Optional<Company> optionalCompany = companyRepository.findById(id);
        if (optionalCompany.isPresent()) {
            Company companyUpdate = optionalCompany.get();
            companyUpdate.setName(company.getName());
            companyUpdate.setDescription(company.getDescription());
            return companyRepository.save(companyUpdate);
        }
        return company;
    }

    @Override
    public boolean addCompanies(Company company) {
        if (Objects.nonNull(company)) {
            companyRepository.save(company);
            return true;
        }return false;
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
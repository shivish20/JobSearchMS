package com.shivish20.company_ms.repository;

import com.shivish20.company_ms.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}

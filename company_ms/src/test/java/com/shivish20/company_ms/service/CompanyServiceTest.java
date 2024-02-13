package com.shivish20.company_ms.service;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.repository.CompanyRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class CompanyServiceTest {
    @Autowired
    CompanyService companyService;
    @MockBean
    private CompanyRepository companyRepository;

    Company setUp() {
        return Company.builder()
                .name("Company Name")
                .description("Company Description")
                .Id(1L)
                .build();
    }

    @Test
    @DisplayName("Get Data based on Valid Company Id")
    public void whenValidCompanyId_thenCompanyShouldFound() {
        Company company = setUp();
        Long companyId = 1L;
        when(companyRepository.findById(1L))
                .thenReturn(Optional.of(company));

        Company companyById = companyService.getCompanyById(companyId);
        assertEquals(companyId, companyById.getId());
    }

    @Test
    void getAllCompanies() {
        //given
        Company company = setUp();
        List<Company> companies = Collections.singletonList(company);

        //When
        when(companyRepository.findAll()).thenReturn(companies);

        //Then
        assertEquals(companies, companyService.getAllCompanies());

    }

    @Test
    void updateCompanyById() {
    }

    @Test
    void addCompanies() {
    }

    @Test
    void deleteCompanyById() {
    }

    @Test
    void getCompanyById() {
    }
}
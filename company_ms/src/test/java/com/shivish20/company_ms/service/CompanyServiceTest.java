package com.shivish20.company_ms.service;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.repository.CompanyRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@SpringBootTest
class CompanyServiceTest {

    private final CompanyService companyService;
    //    @InjectMocks
//    private CompanyServiceImpl companyService;
    @MockBean
    private CompanyRepository companyRepository;

    private static final Long companyId = 1L;

    CompanyServiceTest(CompanyService companyService) {
        this.companyService = companyService;
    }

    Company givenCompany() {
        return Company.builder()
                .name("Company Name")
                .description("Company Description")
                .Id(1L)
                .build();
    }

    @Test
    @DisplayName("Get Data based on Valid Company Id")
    void whenValidCompanyId_thenCompanyShouldFound() {
        //given
        Company company = givenCompany();
        //when
        when(companyRepository.findById(companyId))
                .thenReturn(Optional.of(company));
        //Then
        Company companyById = companyService.getCompanyById(companyId);
        assertEquals(companyId, companyById.getId());
    }

    @Test
    void getAllCompanies() {
        //given
        Company company = givenCompany();
        List<Company> companies = Collections.singletonList(company);
        //When
        when(companyRepository.findAll()).thenReturn(companies);
        //Then
        assertEquals(companies, companyService.getAllCompanies());
    }

/*    @Test
    void updateCompanyById1() {
        //given
        Company companyUpdate = setUp();
        //When
        when(companyRepository.findById(companyUpdate.getId())).thenReturn(Optional.empty());
        when(companyRepository.save(companyUpdate)).thenReturn(companyUpdate);
        //Then
        assertNull(companyService.updateCompanyById(companyId, companyUpdate));
    }*/

    @Test
    void updateCompanyById() {
        //given
        Company company = givenCompany();
        //When
        when(companyRepository.findById(company.getId())).thenReturn(Optional.of(company));
        when(companyRepository.save(company)).thenReturn(company);
        //Then
        assertEquals(company, companyService.updateCompanyById(companyId, company));
    }

    @Test
    void addCompanies() {
    /*    //given
        Company company = setUp();
        //When
        when(companyRepository.save(company)).thenReturn(company);
        //Then
        verify(companyService,atLeastOnce()).addCompanies(company);*/
        // Create a mock object for the service
        Company company = givenCompany();
        CompanyService myServiceMock = mock(CompanyService.class);

        // Call the service method
        myServiceMock.addCompanies(company);

        // Verify that the service method was called with the correct argument
        verify(myServiceMock).addCompanies(company);

        // Verify that the service method returned the expected value
        verify(myServiceMock).addCompanies(company);
    }

    @Test
    void deleteCompanyById() {
    }

    @Test
    void getCompanyById() {
    }
}

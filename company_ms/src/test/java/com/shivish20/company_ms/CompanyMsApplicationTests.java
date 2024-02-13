/*
package com.shivish20.company_ms;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.repository.CompanyRepository;
import com.shivish20.company_ms.service.CompanyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.mockito.Mockito.when;

@SpringBootTest
class CompanyMsApplicationTests {
    @Autowired
    private CompanyService companyService;
    @MockBean
    private CompanyRepository companyRepository;

    @Test
    public void testGetCompanyByIdSuccess() {
        // Arrange
        Long companyId = 1L;
        Company company = new Company("Company Name", "Description");
//			when(userRepository.findById(userId)).thenReturn(Optional.of(user));
        when(companyRepository.findById(companyId)).thenReturn(Optional.of(company));

        // Act
//        User fetchedUser = userService.getUserById(userId);
        Company fetchCompany = companyService.getCompanyById(companyId);

        // Assert
//        assertThat(fetchedUser.getName()).isEqualTo("John Doe");
//        assertThat(fetchCompany.getName(), fetchCompany.getDescription()).isEq
    }

    // More test cases with different scenarios...
}

}
*/

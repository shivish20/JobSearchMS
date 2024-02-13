package com.shivish20.company_ms.controller;

import com.shivish20.company_ms.model.Company;
import com.shivish20.company_ms.service.CompanyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    private final CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies() {
        return new ResponseEntity<>(companyService.getAllCompanies(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Company> getCompany(@PathVariable Long id) {
        Company company = companyService.getCompanyById(id);
        if (company != null) {
            return new ResponseEntity<>(company, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<String> addCompanies(@RequestBody Company company) {
        companyService.addCompanies(company);
        return new ResponseEntity<>("company added successfully", HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id, @RequestBody Company company) {
        companyService.updateCompanyById(id, company);
        return new ResponseEntity<>("company updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCompanyById(@PathVariable Long id) {
        boolean isCompanyDeleted = companyService.deleteCompanyById(id);
        if (isCompanyDeleted) {
            return new ResponseEntity<>("deleted company successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Unsuccessful company deletion", HttpStatus.NOT_FOUND);
        }
    }
}

package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompanyFacade.class);

    @Autowired
    private final CompanyDao companyDao;

    @Autowired
    private final EmployeeDao employeeDao;

    public CompanyFacade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public void findEmployeeByFragment(String employeeFragment) throws CompanyProcessingException {

        boolean wasError = false;

            List<Employee> employees = employeeDao.retrieveEmployeesByNameFragment("%"+employeeFragment+"%");

        try {

            LOGGER.info("Searching for employee with phrase:" + employeeFragment + "...");
            for  (Employee employee: employees){
                LOGGER.info("Found employee: " + employee.getFirstname() + " " + employee.getLastname());
            }

            if (employees.isEmpty()){
                LOGGER.error(CompanyProcessingException.ERR_EMPLOYEE_ERROR);
                wasError = true;
                throw new CompanyProcessingException(CompanyProcessingException.ERR_EMPLOYEE_ERROR);
            }

        } finally {
            if (wasError) {
                LOGGER.info("Cancelling search...");
            }
        }
    }

    public void findCompanyByFragment(String companyFragment) throws CompanyProcessingException {

        boolean wasError = false;

        List<Company> companies = companyDao.retrieveCompaniesByNameFragment("%"+companyFragment+"%");

        try {

            LOGGER.info("Searching for company with phrase:" + companyFragment + "...");
            for  (Company company: companies){
                LOGGER.info("Found company: " + company.getName());
            }

            if (companies.isEmpty()){
                LOGGER.error(CompanyProcessingException.ERR_COMPANY_ERROR);
                wasError = true;
                throw new CompanyProcessingException(CompanyProcessingException.ERR_COMPANY_ERROR);
            }

        } finally {
            if (wasError) {
                LOGGER.info("Cancelling search...");
            }
        }
    }
}

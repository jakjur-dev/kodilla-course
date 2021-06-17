package com.kodilla.hibernate.manytomany.facade;

public class CompanyProcessingException extends Exception {

    public static String ERR_COMPANY_ERROR = "No companies found";
    public static String ERR_EMPLOYEE_ERROR = "No employees found";

    public CompanyProcessingException(String message) {
        super(message);
    }
}

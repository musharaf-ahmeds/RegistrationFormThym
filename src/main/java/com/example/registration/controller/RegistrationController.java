package com.example.registration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.registration.model.BankInfo;
import com.example.registration.model.ContactInfo;
import com.example.registration.model.PersonalInfo;

@Controller
public class RegistrationController {

    @GetMapping("/personal-info")
    public String showPersonalInfo() {
        return "personalinfo";
    }

    @PostMapping("/personal-info")
    public String submitPersonalInfo(PersonalInfo personalInfo) {

        System.out.println("First Name: " + personalInfo.getFirstName());
        System.out.println("Last Name: " + personalInfo.getLastName());
        System.out.println("Middle Name: " + personalInfo.getMiddleName());
        System.out.println("Gender: " + personalInfo.getGender());

        return "contactinfo";
    }
    
    @PostMapping("/contact-info")
    public String submitContactInfo(ContactInfo contactInfo) {

        System.out.println("Address: " + contactInfo.getAddress());
        System.out.println("City: " + contactInfo.getCity());
        System.out.println("State: " + contactInfo.getState());
        System.out.println("Country: " + contactInfo.getCountry());
        System.out.println("Phone: " + contactInfo.getPhone());

        return "bankinfo";
    }
    
    @PostMapping("/bank-info")
    public String submitBankInfo(BankInfo bankInfo) {

        System.out.println("Bank Name: " + bankInfo.getBankName());
        System.out.println("Account Number: " + bankInfo.getAccountNumber());
        System.out.println("SSN: " + bankInfo.getSsn());

        return "success";
    }	
}
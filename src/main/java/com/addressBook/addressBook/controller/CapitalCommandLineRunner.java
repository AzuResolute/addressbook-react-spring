package com.addressBook.addressBook.controller;

import com.addressBook.addressBook.service.CapitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * The CommandLineRunner will run the loadFromText service upon initialization
 */
@Component
public class CapitalCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CapitalService capitalService;

    @Override
    public void run(String... args) throws Exception {
        capitalService.loadFromText();
    }
}

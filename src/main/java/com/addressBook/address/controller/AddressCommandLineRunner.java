package com.addressBook.address.controller;

import com.addressBook.address.service.AddressService;
import com.addressBook.address.service.TextFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * The CommandLineRunner will run the load service upon initialization
 */
@Profile("!test")
@Component
public class AddressCommandLineRunner implements CommandLineRunner {

    @Autowired
    private TextFileService textFileService;

    @Override
    public void run(String... args) throws Exception {
        textFileService.load("addressbook.txt");
    }
}

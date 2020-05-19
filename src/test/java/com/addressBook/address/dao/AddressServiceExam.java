package com.addressBook.address.dao;

import com.addressBook.address.model.Address;
import com.addressBook.address.service.AddressService;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Because I am currently running on Spring, testing here is a bit different - Will research on this more
 */
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddressServiceExam {

    @Autowired
    private AddressService service;

    @Autowired
    private AddressRepository addressBook;
//
    @BeforeEach
    public void setUp() {
        Address[] addressBook = {
                new Address("Faith", "Averuncus", "123 Lilith Path", "Park Lane", "OM", 54321),
                new Address("Negi", "Springfield", "321 Shinjuku Drive", "Nakano", "TY", 98765),
                new Address("Marth", "Ike", "321 Galeforce Drive", "Tiki Town", "FE", 13579)
        };

        Arrays.stream(addressBook).forEach(address -> service.addOrSaveAddress(address));
    }

    @Test
    public void getAllAddresses() {
        int numOfAddresses = service.size();
        assertEquals(3, numOfAddresses, "It seems to pick up the autowired repo");
    }

    @Test
    public void getSingleAddress() {
        Address newNeighbor = new Address("Hope", "Averuncus", "321 Lilith Path", "Park Lane", "OM", 54321);

        service.addOrSaveAddress(newNeighbor);
        Address retrievedAddress = service.getAddress(newNeighbor.getId()).get();

        assertNotNull(retrievedAddress, "There is something here");
        assertEquals(newNeighbor.getFirstName(), retrievedAddress.getFirstName(), "First name is the same");
        assertEquals(newNeighbor.getLastName(), retrievedAddress.getLastName(), "Last name the same");
    }
}
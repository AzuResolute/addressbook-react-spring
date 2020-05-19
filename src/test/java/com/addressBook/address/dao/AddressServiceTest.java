package com.addressBook.address.dao;

import com.addressBook.address.model.Address;
import org.junit.jupiter.api.*;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Because I am currently running on Spring, testing here is a bit different - Will research on this more
 */

//@RunWith(SpringRunner.class)
//@DataJpaTest
public class AddressServiceTest {

//    @Autowired
//    private AddressRepository testAddressRepo;
//
//    @BeforeEach
//    public void setUp() {
//        testAddressRepo.save(
//            new Address("Faith", "Averuncus", "123 Lilith Path","Park Lane","OM",54321)
//        );
//        testAddressRepo.save(
//            new Address("Negi", "Springfield", "321 Shinjuku Drive","Nakano","TY",98765)
//        );
//        testAddressRepo.save(
//                new Address("Marth", "Ike", "321 Galeforce Drive","Tiki Town","FE",13579)
//        );
//    }
//
//    @Test
//    void testGetAddress(){
//        Address mthree = new Address("Em","Three","17 State St 6th Floor","New York","NY",10004);
//
//        Address retrievedAddress = testAddressRepo.findById(mthree.getId()).get();
//
//        assertEquals(mthree.getId(), retrievedAddress.getId(), "Checking Address Id");
//        assertEquals(mthree.getFirstName(), retrievedAddress.getFirstName(), "Checking First Name");
//        assertEquals(mthree.getLastName(), retrievedAddress.getLastName(), "Checking Last Name");
//        assertEquals(mthree.getStreetAddress(), retrievedAddress.getStreetAddress(), "Checking Address");
//        assertEquals(mthree.getCity(), retrievedAddress.getCity(), "Checking City");
//    }
}
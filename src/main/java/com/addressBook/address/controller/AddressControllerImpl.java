package com.addressBook.address.controller;

import com.addressBook.address.model.Address;
import com.addressBook.address.service.AddressService;
import com.addressBook.address.service.TextFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/addressbook")
public class AddressControllerImpl implements AddressController{

    @Autowired
    private AddressService addressService;

    @Autowired
    private TextFileService textFileService;

    @Override
    @GetMapping("")
    public ResponseEntity<?> getAll() throws Exception {
        Iterable<Address> addressBook = addressService.getAll();
        return new ResponseEntity<Iterable<Address>>(addressBook, HttpStatus.OK);
    }

    @Override
    @GetMapping("/size")
    public ResponseEntity<?> getSize() throws Exception {
        return new ResponseEntity<Integer>(addressService.size(), HttpStatus.OK);
    }

    @Override
    @GetMapping("/byId/{id}")
    public ResponseEntity<?> getAddressById(@PathVariable String id) throws Exception {
        long longId = Long.parseLong(id);
        Optional<Address> address = addressService.getAddress(longId);
        return new ResponseEntity<Optional<Address>>(address, HttpStatus.OK);
    }

    @Override
    @PostMapping("")
    public ResponseEntity<?> addOrSaveAddress(@RequestBody Address address) {
        Address newAddress = addressService.addOrSaveAddress(address);
        return new ResponseEntity<Address>(newAddress, HttpStatus.OK);
    }

    @Override
    @DeleteMapping("/byId/{id}")
    public ResponseEntity<?> deleteAddressById(@PathVariable String id) {
        long longId = Long.parseLong(id);
        addressService.deleteAddress(longId);
        return new ResponseEntity<String>("Address with ID:" +
                id + " was successfully deleted", HttpStatus.OK);
    }
}

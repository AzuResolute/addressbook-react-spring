package com.addressBook.address.controller;

import com.addressBook.address.model.Address;
import org.springframework.http.ResponseEntity;

public interface AddressController {
    ResponseEntity<?> getAll() throws Exception;
    ResponseEntity<?> getSize() throws Exception;
    ResponseEntity<?> getAddressById(String id) throws Exception;
    ResponseEntity<?> addOrSaveAddress(Address address);
    ResponseEntity<?> deleteAddressById(String id);
}

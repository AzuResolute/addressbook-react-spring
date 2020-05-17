package com.addressBook.address.service;

import com.addressBook.address.model.Address;

import java.util.Optional;

public interface AddressService {
    Optional<Address> getAddress(long id);
    Iterable<Address> getAll();
    Address addOrSaveAddress(Address address);
    void deleteAddress(long id);
    int size();
}

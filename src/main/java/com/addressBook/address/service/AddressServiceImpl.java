package com.addressBook.address.service;

import com.addressBook.address.dao.AddressRepository;
import com.addressBook.address.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {

    public AddressServiceImpl() {}

    @Autowired
    private AddressRepository addressBook;


    @Override
    public Optional<Address> getAddress(long id) {
        return addressBook.findById(id);
    }

    @Override
    public Iterable<Address> getAll() {
        return addressBook.findAll();
    }

    @Override
    public Address addOrSaveAddress(Address address) {
        addressBook.save(address);
        return address;
    }

    @Override
    public void deleteAddress(long id) {
        Optional<Address> address = addressBook.findById(id);

        if(address.isPresent()) {
            addressBook.delete(address.get());
        }
    }

    @Override
    public int size() {
        return (int) addressBook.count();
    }
}

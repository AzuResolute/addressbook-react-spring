package com.addressBook.address.service;

import com.addressBook.address.dao.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl {

    @Autowired
    private AddressRepository addressBook;


}

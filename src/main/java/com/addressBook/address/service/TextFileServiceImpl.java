package com.addressBook.address.service;

import com.addressBook.address.dao.AddressRepository;
import com.addressBook.address.model.Address;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TextFileServiceImpl implements TextFileService {
    @Autowired
    private AddressRepository addressBook;

    @Override
    public int load(String filePath) throws Exception {
        String fileName = "addressbook.txt";
        int count = 0;
        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(fileName)));
            while(scanner.hasNextLine()) {
                Address entry = loadLine(scanner.nextLine());
                addressBook.save(entry);
                count++;
            }

            return count;

        } catch (Exception ex) {
            throw new Exception("Failed to load from " + fileName);
        }
    }

    @Override
    public Address loadLine(String line) throws Exception {

        // <firstName>::<lastName>::<streetAddress>::<city>::<state>::<zip>
        try {
            String[] parsedLine = line.split("::");
            String firstName = parsedLine[0];
            String lastName = parsedLine[1];
            String streetAddress = parsedLine[2];
            String city = parsedLine[3];
            String state = parsedLine[4];
            int zip = Integer.parseInt(parsedLine[5]);

            return new Address(firstName, lastName, streetAddress, city, state, zip);
        } catch (Exception ex) {
            throw new Exception("Invalid figures");
        }
    }

    @Override
    public int save() throws IOException {
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));

        List<String> stringRepo = stringifyRepo();
        stringRepo.forEach(s -> out.println(s));

        out.flush();
        out.close();

        return stringRepo.size();
    }

    @Override
    public List<String> stringifyRepo() {
        List<String> stringAddressBook = new ArrayList<>();
        Iterator<Address> iterableAddressBook = addressBook.findAll().iterator();

        while(iterableAddressBook.hasNext()) {
            Address address = iterableAddressBook.next();
            StringBuilder stringAddress = new StringBuilder();

            stringAddress.append(address.getFirstName());
            stringAddress.append(address.getLastName());
            stringAddress.append(address.getStreetAddress());
            stringAddress.append(address.getCity());
            stringAddress.append(address.getState());
            stringAddress.append(address.getZip());

            stringAddressBook.add(stringAddress.toString());
        }

        return stringAddressBook;
    }
}

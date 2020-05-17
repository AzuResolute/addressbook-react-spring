package com.addressBook.address.service;

import com.addressBook.address.model.Address;

import java.io.IOException;
import java.util.List;

public interface TextFileService {
    int load(String filePath) throws Exception;
    Address loadLine(String line) throws Exception;
    int save() throws IOException;
    List<String> stringifyRepo();
}

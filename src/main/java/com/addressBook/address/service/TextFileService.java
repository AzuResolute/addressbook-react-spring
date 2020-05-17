package com.addressBook.address.service;

import com.addressBook.address.model.Address;
import com.addressBook.example.model.Capital;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public interface TextFileService {
    int load(String filePath) throws Exception;
    Address loadLine(String line) throws Exception;
    int save() throws IOException;
    List<String> stringifyRepo();
}

package com.addressBook.example.dao;

import com.addressBook.example.model.Capital;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapitalRepository extends CrudRepository<Capital, String>, JpaSpecificationExecutor<Capital> {}

package com.statecapitals3.statecapitals3.repository;

import com.statecapitals3.statecapitals3.model.Capital;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CapitalRepository extends CrudRepository<Capital, String>, JpaSpecificationExecutor<Capital> {}

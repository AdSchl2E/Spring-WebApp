package com.adschl2e.tuto_api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adschl2e.tuto_api.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
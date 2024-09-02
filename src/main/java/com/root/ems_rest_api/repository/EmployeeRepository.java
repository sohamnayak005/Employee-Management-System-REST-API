package com.root.ems_rest_api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.root.ems_rest_api.dto.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

  boolean existsByMob(long mob);

  List<Employee> findByName(String name);

  Employee findByMob(long mob);

}

package com.project.pma.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.project.pma.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{

	public List<Employee> findAll();
}

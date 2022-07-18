package com.nt.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nt.Entity.Employee;

@Repository
public interface EmpDao extends CrudRepository<Employee, Integer> {

	List<Employee> findAll();

	Employee findById(int id);

	Employee findBySal(int sal);

}

package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		int i = rs.getInt("id");
		String name = rs.getString("name");
		int sal = rs.getInt("sal");

		Employee e = new Employee(i, name, sal);

		return e; // return of queryForObject()

	}

}

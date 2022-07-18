package com.nt.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Dao.EmpDao;
import com.nt.Entity.Employee;

@Service
public class EmpService {

	
	@Autowired
	private EmpDao empDao;
	
	public List<Employee> getAll() {
		
		return empDao.findAll();
	}

	public Employee getById(int id) {
		
		return empDao.findById(id);
	}

	public Employee getBySal(int sal) {
		
		return empDao.findBySal(sal);
	}
	
	

}

package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Entity.Employee;
import com.nt.Service.EmpService;


@RestController
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping(value="/health-check", method = RequestMethod.GET)
	public String health_check() {
		return "Hello Eclipse";
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello";
	}
	
	@GetMapping(value="/all")
	public List<Employee> getAll(){
		return empService.getAll();
	}
	
	@GetMapping(value="/employee/id/{id}")
	public Employee getById(@PathVariable int id) {
		Employee e = empService.getById(id);
		return e;
	}
	
	@GetMapping(value = "/employee/sal/{sal}")
	public Employee getBySal(@PathVariable int sal) {
		Employee e = empService.getBySal(sal);
		return e;
		
	}

}

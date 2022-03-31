package com.employee;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service // annotation
public class EmployeeService {

	@Autowired // object creation spring
	EmployeeRepository repository;

	public List<Employee> getAllEmployees() {

		List<Employee> employeeList = repository.findAll();

		return employeeList; // list of employee

	}

	public void addEmployee(Employee employee) {// post mapping

		repository.save(employee);
		
		// calling repository or data access object
	}

	public void deleteEmployee(Integer id) {// delete mapping
		repository.deleteById(id);
	}

	public void updateEmployee(Employee employee) {
		repository.save(employee); // update
	}
//	public void addEmployee (Employee employee) {
//		repository.save(employee);
//	}

	public List<String> getEmployeeNames() {
		List<Employee> empList = getAllEmployees();

		List<String> namesList = new ArrayList<>();
		for (Employee employee : empList) {
			namesList.add(employee.getName());
		}

		return namesList;
	}

	public String getAllUserData() {

		// External API - How to consume an API
		// RestTemplate class - HttpClient
		// Webclient

		RestTemplate rt = new RestTemplate();
		String response = rt.getForEntity("https://jsonplaceholder.typicode.com/users", String.class).getBody();
		return response;

	}

	String getAllEmployeeData() {
		return null;

	}

}

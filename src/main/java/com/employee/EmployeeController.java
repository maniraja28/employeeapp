package com.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // annotation
public class EmployeeController {//class name should be camel case convention

	@Autowired // annotation object created by the spring boot
	EmployeeService service;

	// get all employees read the data in controller only we have to do deligations only
	@GetMapping("/employees")//
	public List<Employee> getAllEmployees() {// method creation
		List<Employee> empList = service.getAllEmployees();// object calling invoked service method
		return empList;
	}

	// Add new employee
	@PostMapping("/employees")//data is added by the use of postmapping
	public void addEmployee(@RequestBody Employee employee)// method creation
	{
		 service.addEmployee(employee);
		
	}

	// delete an employee by id

	@DeleteMapping("/employees/{id}")
	public void deleteEmployeeById(@PathVariable Integer id) {
		service.deleteEmployee(id);
	}

	// update/modify an employee
	@PutMapping("/employees")
	public void updateEmployee(@RequestBody Employee employee)// method creation
	{
		service.updateEmployee(employee);
	}

	@GetMapping // is used for printing purpose like output
	public List<String> getNames() {
//		EmployeeService service = new EmployeeService();
		List<String> list = service.getEmployeeNames();
		return list;
	}

	@GetMapping("/usersdata")
	public String getAllUserData() {
		
		String response = service.getAllUserData();
		return response;
	}

}

//	@GetMapping
//	public Set getFruits(){

//		return "Hi,iam learning java";
//		List<String> fruits = Arrays.asList("apple","cashew","dates");
//		return fruits;

// Set<Integer> names = new HashSet<>();

//		names.add(123);
//		names.add(12);

//		return names;

//	}

//	@GetMapping("/hello")
//	public String sayHello()
//	{
//		return "hello I m JOhn";
//	}

// @PostMapping - CREATE (C) / add
// @GetMapping - READ (R) / get
// @PutMapping - Update (U) / modify
// @DeleteMapping - Delete (D) / remove

//	public  int add(int a, int b)//method name same but parameters are differnt is nothing but overloading
//	{
//		int c = a+b;
//		return c ;
//	}
//
//	public int add(int a, int b, int c)//method name should be same but parameters are differnt is nothing but overloading
//	{
//		
//		return a+b+c;
//	}
//	
//	public int add(int a, int b, int c, int d)
//	{
//		return a+b+c+d;
//	}

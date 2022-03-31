package com.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//annotation
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

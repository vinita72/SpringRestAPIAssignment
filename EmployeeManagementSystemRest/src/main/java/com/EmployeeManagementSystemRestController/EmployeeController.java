package com.EmployeeManagementSystemRestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.relation.RoleInfoNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeManagementSystemRestModel.Employee;
import com.EmployeeManagementSystemRestRepository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
@Autowired
	public EmployeeRepository employeeRepository;
	
@GetMapping("/employees")
	public List<Employee> getAllEmployee(){
		
		return employeeRepository.findAll();
	}

@PostMapping("/employees")
public Employee createEmployee(@Validated @RequestBody Employee employee) {
 return employeeRepository.save(employee);
}


@PutMapping("/employees/{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
		@Validated @RequestBody Employee employeeDetails) throws RoleInfoNotFoundException {
	Employee employee = employeeRepository.findById(employeeId)
			.orElseThrow(() -> new RoleInfoNotFoundException("Employee not found for this id :: " + employeeId));

	employee.setEmail(employeeDetails.getEmail());
	employee.setName(employeeDetails.getName());
	employee.setId(employeeDetails.getId());
	final Employee updatedEmployee = employeeRepository.save(employee);
	return ResponseEntity.ok(updatedEmployee);
}

@DeleteMapping("/employees/{id}")
public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long employeeId)
		throws RoleInfoNotFoundException {
	Employee employee = employeeRepository.findById(employeeId)
			.orElseThrow(() -> new RoleInfoNotFoundException("Employee not found for this id :: " + employeeId));

	employeeRepository.delete(employee);
	Map<String, Boolean> response = new HashMap<>();
	response.put("deleted", Boolean.TRUE);
	return response;
}

}
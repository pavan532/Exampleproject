package com.nit.jdbc.oracle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class SpringBootJdbcController {

	@Autowired
	JdbcTemplate jdbc;
	
	@RequestMapping("/insert")
	public String index() {
        jdbc.execute("INSERT INTO Employee_Springboot (BASELOCATION, EMPLOYEE_ASSIGNDPROJECTS, EMPLOYEEEMAIL, EMPLOYEENAME, EMPLOYEEBASELOCATION)"
        		+ "VALUES ('dammy', 10, 'dammy@gmail.com', 'dammy', 'dammy')");  
		return "data inserted Successfully";
	}
}
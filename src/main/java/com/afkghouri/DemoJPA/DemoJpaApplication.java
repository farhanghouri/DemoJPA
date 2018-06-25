package com.afkghouri.DemoJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
 

@SpringBootApplication
public class DemoJpaApplication {

	public static void main(String[] args) { 
		  System.out.println("hello JPA Demo");
		   ConfigurableApplicationContext configurableApplicationContext =  SpringApplication.run(DemoJpaApplication.class, args);
	       EmployeeController  employeeController = configurableApplicationContext.getBean(EmployeeController.class); 
	       employeeController.findAll();
	}
}

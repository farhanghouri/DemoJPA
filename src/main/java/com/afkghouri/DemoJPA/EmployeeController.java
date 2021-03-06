package com.afkghouri.DemoJPA;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;
    
    public void findAll(){
    	for(EmployeeModel em : employeeRepository.findAll()){
    		System.out.println("employee id: "+em.oid);
    		System.out.println("employee name: "+em.ename);
    		System.out.println("employee phone no: "+em.phno+"\n");
    	}
    }
}

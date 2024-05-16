package Employee_servlet.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Employee_servlet.dto.Employee_dto;

public class Employee_dao {
	EntityManagerFactory e = Persistence.createEntityManagerFactory("servletemployee");
	EntityManager m = e.createEntityManager();
	EntityTransaction t = m.getTransaction();

	public String insertData(Employee_dto employeeDto) {
		t.begin();
		m.persist(employeeDto);
		t.commit();
		return "data inserted successfully";
	}
	
	
	
}
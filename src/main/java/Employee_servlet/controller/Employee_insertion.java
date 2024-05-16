package Employee_servlet.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import Employee_servlet.dao.Employee_dao;
import Employee_servlet.dto.Employee_dto;


@WebServlet("/insert")
public class Employee_insertion implements Servlet {
	private static final Employee_dao Employee_Dao = null;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = req.getParameter("empid");
		String firstname = req.getParameter("first_name");
		String lastname = req.getParameter("last_name");
		String department = req.getParameter("department");
		LocalDate hiredate = LocalDate.parse(req.getParameter("hire_date"));
		String position = req.getParameter("position");
		String sal=req.getParameter("salary");
		//String salary = req.getParameter("salary");

		Employee_dto employeeDto = new Employee_dto();
		// create the object of dto & set the values to object

		//long sal_ary = Long.parseLong(salary);

		employeeDto.setFirst_name(firstname);
		employeeDto.setLast_name(lastname);
		employeeDto.setHire_date(hiredate);
		employeeDto.setSalary(sal);
		employeeDto.setDepartment(department);
		employeeDto.setPosition(position);

		System.out.println(employeeDto);
//
//		Employee_dao employee_Dao = new Employee_dao();// create the object of dao & pass the object
//		String msg = Employee_Dao.insertData(employeeDto);
//		res.getWriter().print(msg);
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

}
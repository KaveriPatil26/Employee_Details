package Employee_servlet.dto;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Employee_dto {
	@Id
	@GeneratedValue
	private int id;
	private String first_name;
	private String last_name;
	private String department;
	private String position;
	private LocalDate hire_date;
	private String salary;

}

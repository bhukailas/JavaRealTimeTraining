package sorting.vo;

import java.time.LocalDate;
import java.util.Date;

public class Employee {
	private int id;
	private String name;
	private LocalDate joiningDate;
	private float salary;
	
	public Employee(int id, String name, LocalDate joiningDate, float salary) {
		this.id = id;
		this.name = name;
		this.joiningDate = joiningDate;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(LocalDate joiningDate) {
		this.joiningDate = joiningDate;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", joiningDate=" + joiningDate + ", salary=" + salary + "]";
	}
}
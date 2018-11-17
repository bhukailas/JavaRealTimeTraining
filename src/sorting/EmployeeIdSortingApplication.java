package sorting;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import sorting.comparators.EmployeeComparators;
import sorting.vo.Employee;

public class EmployeeIdSortingApplication {
	public static void main(String[] args) {
		List<Employee> listOfEmployee = prepareEmployeeList();
		//System.out.println("numberOfEmployee: "+listOfEmployee.stream().count());
		Collections.sort(listOfEmployee, EmployeeComparators.idComparator);
		
		for(Employee emp : listOfEmployee) {
			print(emp);
		}
	}

	private static void print(Object obj) {
		System.out.println(obj.toString());
	}

	private static List<Employee> prepareEmployeeList() {
		Employee emp1 = new Employee(1, "Raju", LocalDate.of(2015, Month.APRIL, 1), 50000);
		Employee emp2 = new Employee(2, "Kiran", LocalDate.of(2014, Month.JULY, 23), 60000);
		Employee emp3 = new Employee(3, "Meena", LocalDate.of(2010, Month.DECEMBER, 12), 90000);
		Employee emp4 = new Employee(4, "Aravind", LocalDate.of(2018, Month.JANUARY, 15), 10000);
		Employee emp5 = new Employee(5, "Kiran", LocalDate.of(2013, Month.MAY, 23), 70000);
		Employee emp6 = new Employee(6, "Jhon", LocalDate.of(2018, Month.JULY, 12), 90000);
		Employee emp7 = new Employee(7, "Aravind", LocalDate.of(2018, Month.JULY, 12), 35000);
		Employee emp8 = new Employee(8, "Mano", LocalDate.of(2018, Month.JULY, 12), 90000);
		
		List<Employee> list = new ArrayList<>();
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		list.add(emp7);
		list.add(emp8);
		
		return list;
	}
}

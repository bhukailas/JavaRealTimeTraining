package sorting.comparators;

import java.util.Comparator;

import sorting.vo.Employee;

public class EmployeeComparators {
	public static Comparator<Employee> nameComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getName().compareTo(o2.getName());
		}
	};
	
	public static Comparator<Employee> joingDateComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getJoiningDate().compareTo(o2.getJoiningDate());
		}
	};
	
	public static Comparator<Employee> salaryComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			if( o1.getSalary() - o2.getSalary() == 0)
				return 0;
			else if(o1.getSalary() > o2.getSalary()) {
				return 1;
			} else {
				return -1;
			}
		}
	};
	
	public static Comparator<Employee> idComparator = new Comparator<Employee>() {
		@Override
		public int compare(Employee o1, Employee o2) {
			if( o1.getId() - o2.getId() == 0)
				return 0;
			else if(o1.getId() > o2.getId()) {
				return 1;
			} else {
				return -1;
			}
		}
	};
}

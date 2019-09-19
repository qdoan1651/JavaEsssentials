/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sorting/EmployeeSort.java
 * Guide to Java 8 Comparator.comparing()
 * https://www.baeldung.com/java-8-comparator-comparing
 */
package oop.sort.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
	public static void main(String[] args) {
		List<Employee> employees = createEmployeesList();
		
		System.out.println("*** Before sorting:");
        for (Employee emp: employees) {
            System.out.println(emp);
        }
        
        // Sort employees by single key (employee name)
//        sortEmployeesListByName(employees);
        
        // Sort employees by multiple keys (job title, age, salary, name)
        sortEmployeesListMultipleFields(employees);
        
        System.out.println("\n*** After sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
	}
	
	public static List<Employee> createEmployeesList() {
		List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Tom", "Developer", 45, 80000));
        employees.add(new Employee("Sam", "Designer", 30, 75000));
        employees.add(new Employee("Bob", "Designer", 45, 134000));
        employees.add(new Employee("Peter", "Programmer", 25, 60000));
        employees.add(new Employee("Tim", "Designer", 45, 130000));
        employees.add(new Employee("Craig", "Programmer", 30, 52000));
        employees.add(new Employee("Anne", "Programmer", 25, 51000));
        employees.add(new Employee("Alex", "Designer", 30, 120000));
        employees.add(new Employee("Bill", "Programmer", 22, 30000));
        employees.add(new Employee("Samuel", "Developer", 28, 80000));
        employees.add(new Employee("John", "Developer", 35, 67000));
        employees.add(new Employee("Patrick", "Developer", 35, 140000));
        employees.add(new Employee("Alice", "Programmer", 35, 80000));
        employees.add(new Employee("David", "Developer", 35, 99000));
        employees.add(new Employee("Jane", "Designer", 30, 82000));
        
        return employees;
	}
	
	/*
	 * Sort employees list by single field (name, salary, age, etc...)
	 */
	public static void sortEmployeesListByName(List<Employee> employees) {
		Comparator<Employee> comparator = Comparator.comparing(Employee::getName);
		Collections.sort(employees, comparator);
	}
	
	/*
	 * Sort employees list by multiple fields (job title, age, salary, and name)
	 */
	public static void sortEmployeesListMultipleFields(List<Employee> employees) {
		// Sort by job title, age, salary, and name 
        Comparator<Employee> comparator = Comparator
        		.comparing(Employee::getJobTitle)
				.thenComparing(Employee::getAge, (s1, s2) -> {return s2.compareTo(s1);})
				.thenComparing(Employee::getSalary, (s1, s2) -> {return s2.compareTo(s1);})
				.thenComparing(Employee::getName);
    	Collections.sort(employees, comparator);
	}
}



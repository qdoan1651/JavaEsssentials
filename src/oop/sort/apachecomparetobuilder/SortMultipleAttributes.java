/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/apachecomparetobuilder/SortMultipleAttributes.Java
 * Sorting a list by multiple attributes/keys example
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */
package oop.sort.apachecomparetobuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class SortMultipleAttributes {
	public static void main(String[] args) {
		// Create a list of employees
		List<Employee> employees = createEmployeesList();
 
        System.out.println("*** Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
 
        // Sort by job title, then age, then salary
//        sortByJobTitleAgeSalary(employees);
    	
    	// Sort by job title, then age, then salary in reverse (highest salary first)
        sortByJobTitleAgeSalaryReversed(employees);
        
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

	public static void sortByJobTitleAgeSalary(List<Employee> employees) {
		Comparator<Employee> comparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee emp1, Employee emp2) {
				return new CompareToBuilder()
		                .append(emp1.getJobTitle(), emp2.getJobTitle())
		                .append(emp1.getAge(), emp2.getAge())
		                .append(emp1.getSalary(), emp2.getSalary()).toComparison();
			}
    	};
    	
    	Collections.sort(employees, comparator);
	}
	
	public static void sortByJobTitleAgeSalaryReversed(List<Employee> employees) {
		Comparator<Employee> comparator = new Comparator<Employee>() {
    		@Override
    		public int compare(Employee emp1, Employee emp2) {
    			return new CompareToBuilder()
    	                .append(emp1.getJobTitle(), emp2.getJobTitle())
    	                .append(emp1.getAge(), emp2.getAge())
    	                .append(emp2.getSalary(), emp1.getSalary()).toComparison();
    		}
    	};
    	
    	Collections.sort(employees, comparator);
	}
}



/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/chainedcomparator/SortMultipleAttributes.java
 * Sorting a list by multiple attributes example
 * @author https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */
package oop.sort.chainedcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortMultipleAttributes {
    public static void main(String[] args) {
        List<Employee> employees = createEmployeesList();
 
        System.out.println("*** Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
 
        // Sort employees by job title, age, and salary
        sortByTitleAgeSalary(employees);
        
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
    
    public static void sortByTitleAgeSalary(List<Employee> employees) {
    	Collections.sort(employees, new EmployeeChainedComparator(
  	           new EmployeeJobTitleComparator(),
  	           new EmployeeAgeComparator(),
  	           new EmployeeSalaryComparator())
  		 );
    }
}

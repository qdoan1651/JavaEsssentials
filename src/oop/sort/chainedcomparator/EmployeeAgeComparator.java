/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/chainedcomparator/EmployeeAgeComparator.java
 * Sorting a list by multiple attributes example
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */
package oop.sort.chainedcomparator;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {
	/**
	 * Compares two employees by their ages
	 */
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getAge() - emp2.getAge();
    }
}


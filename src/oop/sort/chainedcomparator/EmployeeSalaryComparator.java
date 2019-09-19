/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/chainedcomparator/EmployeeSalaryComparator.java
 * This comparator compares two employees by their salaries.
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */

package oop.sort.chainedcomparator;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getSalary() - emp2.getSalary();
    }
}


/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/chainedcomparator/EmployeeJobTitleComparator.java
 * This comparator compares two employees by their job titles.
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */
package oop.sort.chainedcomparator;

import java.util.Comparator;

public class EmployeeJobTitleComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp1.getJobTitle().compareTo(emp2.getJobTitle());
    }
}

/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/chainedcomparator/EmployeeChainedComparator.java
 * This is a chained comparator that is used to sort a list by multiple attributes 
 * by chaining a sequence of comparators of individual fields together.
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */
package oop.sort.chainedcomparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeChainedComparator implements Comparator<Employee> {
 
    private List<Comparator<Employee>> listComparators;
 
    @SafeVarargs
    public EmployeeChainedComparator(Comparator<Employee>... comparators) {
        this.listComparators = Arrays.asList(comparators);
    }
 
    @Override
    public int compare(Employee emp1, Employee emp2) {
        for (Comparator<Employee> comparator: listComparators) {
            int result = comparator.compare(emp1, emp2);
            if (result != 0) {
                return result;
            }
        }
        return 0;
    }
}


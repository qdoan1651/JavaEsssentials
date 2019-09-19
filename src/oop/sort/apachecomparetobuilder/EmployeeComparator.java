/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/apachecomparetobuilder/EmployeeComparator.Java
 * Sorting a list by multiple attributes example
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */

package oop.sort.apachecomparetobuilder;

import java.util.Comparator;
import org.apache.commons.lang3.builder.CompareToBuilder;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return new CompareToBuilder()
                .append(emp1.getJobTitle(), emp2.getJobTitle())
                .append(emp1.getAge(), emp2.getAge())
                .append(emp2.getSalary(), emp1.getSalary()).toComparison();
    }
}


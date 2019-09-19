/*
 * https://github.com/qdoan1651/JavaEssentials/oop/sort/apachecomparetobuilder/Employee.java
 * Sorting a list by multiple attributes example
 * https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example
 */

package oop.sort.apachecomparetobuilder;

public class Employee {
    private String name;
    private String jobTitle;
    private int age;
    private int salary;
 
    public Employee(String name, String jobTitle, int age, int salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.salary = salary;
    }
 
    public String getJobTitle() {
    	return this.jobTitle;
    }
    
    public int getAge() {
    	return this.age;
    }
    
    public int getSalary() {
    	return this.salary;
    }
    
    public String toString() {
        return String.format("%s\t%s\t%d\t%d", name, jobTitle, age, salary);
    }
}

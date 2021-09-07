package sandbox;

public class ClassSandbox {
	public String name;
    private String jobTitle;
    private int age;
    private int salary;
 
    public ClassSandbox(String name, String jobTitle, int age, int salary) {
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

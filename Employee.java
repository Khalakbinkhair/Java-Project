package Classes;

public abstract class Employee {
	protected String name;
	protected String id;
	protected double salary;
	
	public Employee() {}
	public Employee(String id, String name,double salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	public abstract void setName(String name);
	public abstract void setId(String id);
	public abstract String getName();
	public abstract String getId();
	public abstract void setSalary(double salary);
	public abstract double getSalary();
	
		
	
}

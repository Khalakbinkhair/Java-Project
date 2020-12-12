package Classes;

public class Nurse extends Employee{
	
	
	public Nurse() {}
	public Nurse(String id, String name, double salary)
	{
		super(id,name,salary);
		
	}
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}

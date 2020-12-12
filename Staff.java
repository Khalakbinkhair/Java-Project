package Classes;

public class Staff extends Employee {
	private String category;
	
	
	public Staff() {}
	public Staff(String id, String name, String category, double salary)
	{
		super(id,name,salary);
		this.category = category;
	
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
	public void setCategory(String category)
	{
		this.category = category;
	}
	public String getCategory()
	{
		return category;
	}
	
}

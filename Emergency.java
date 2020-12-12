package Classes;

public class Emergency {
	private String Name;
	private int Age;
	private String Number;
	private String Problem;
	
	public Emergency() {}
	public Emergency(String Name, int Age, String Number,String Problem)
	{
		this.Name= Name;
		this.Age = Age;
		this.Number = Number;
		this.Problem = Problem;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getNumber() {
		return Number;
	}
	public void setNumber(String number) {
		Number = number;
	}
	public void setProblem(String problem)
	{
		this.Problem = problem;
	}
	public String getProblem()
	{
		return Problem;
	}
}

package Encapsulation1;

public class employee {
	private String name;
	private int salary;
	public String getName()
	{
		return name;
	}
	public int getSalary()
	{
		return salary;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(int salary)
	{
		this.salary=salary;
	}
}

class Encap
{
	public static void main(String[] args) {
		employee e=new employee();
		e.setName("Swapnil");
		e.setSalary(100000);
		System.out.println(e.getName());
		System.out.println(e.getSalary());
	}
}

package Task_08;

public abstract class Developer extends Person {

	protected int experience;
	
	public Developer(String name, double basicSalary, int experience) {
		this.name = name;
		this.basicSalary = basicSalary;
		this.experience = experience;
	}
	

	

	
	public abstract double getSalary();
}

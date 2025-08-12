package oops;

class Employee
{
	void company()
	{
		System.out.println("Company : Tnsif");
	}
}

class Developer extends Employee
{
	void role()
	{
		System.out.println("Role : Software Developer");
	}
}

class Tester extends Employee
{
	void role()
	{
		System.out.println("Role : Qa Tester");
	}
}

public class Hierarchicalinheritance {
	public static void main (String[] args) {
		Developer dev = new Developer();
		Tester te = new Tester();
		
		dev.company();
		dev.role();
		
		te.company();
		te.role();
		
	}

}

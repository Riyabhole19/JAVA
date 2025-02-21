class Employee
{
int salary;
public static void calculateSalary()
{
System.out.println("Employee Salary");
}
}
class Manager
{
public static void calculateSalary()
{
System.out.println("Manager Salary :-6000000");
}
}
class Programmer
{

public void calculateSalary()
{
System.out.println("Programmer Salary :-3000000");
}
}
class EmployeeD
{
public static void main(String [] args)
{
	Programmer P=new Programmer();
	P.calculateSalary();
	Manager M=new Manager();
	M.calculateSalary();
	
}
}
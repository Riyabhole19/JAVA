class Shape


{
double area;
	public double calculateArea(double area)
	{
		System.out.println("Calculate the area");
		return area;
	}
}
class Circle 

{
public static void calculateArea()
	{
System.out.println("This is a Circle");
}
}
class Rectangle 

{
public static void calculateArea()
	{
System.out.println("This is a REctangle");
}
}
class Triangle 
{
public static void calculateArea()
	{
System.out.println("This is a triangle");
}
}

class ShapeD
{
	public static void main(String [] args)
	{
		Shape S2=new Shape();
		System.out.println(S2.calculateArea(32434.5));
		Circle s=new Circle();
		s.calculateArea();
		Triangle s1=new Triangle();
		s1.calculateArea();
	}
}
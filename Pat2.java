#	Write a Program to Print Pattern 

#	     ******
#	    ******
#	   ******
#	  ******
#	 ******
#	******



import java.util.Scanner;
public class Pat2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the number :- ");
		int n=sc.nextInt();
		Pattern (n);
	}
	static void Pattern(int n)
	{	
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print(" ");
			}
		for(int j=0;j<n;j++)
		{
			System.out.print("*");
		}
		System.out.println();
		}
	}
}

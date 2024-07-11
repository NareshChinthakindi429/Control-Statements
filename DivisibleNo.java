package ControlStatement;
import java.util.Scanner;
public class DivisibleNo {

	public static void main(String[] args) 
	{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a No.");
	float n=s.nextInt();
	if(n%7==0)
	{
		n*=2.5; // n=n*2.5;
		System.out.println("Divisible and No. is = "+n);
	}
	else
	{
		n-=10; //n=n-10;
		System.out.println("Not Divisible and No. is = "+n);
	}

	}

}

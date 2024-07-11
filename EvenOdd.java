package ControlStatement;
import java.util.Scanner;
public class EvenOdd 
{
public static void main(String []args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a Number to check Positive or Not:");
	int n=s.nextInt();
	System.out.println("First Numebr is = "+n);
	if(n%2==0)
	{
		n=n+100;
		//System.out.println("You Enter Positive Number");
	}
	else
	{
		n=n-100;
		//System.out.println("You Enter negative Number");
	}
	System.out.println("Final Numebr is = "+n); 
	
}	
}

package ControlStatement;
import java.util.Scanner;
public class ternaryOp 
{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first No.");
		int a=s.nextInt();
		System.out.println("Enter 2nd No.");
		int b=s.nextInt();
		int c=a>b?a:b>a?b:-1;
		System.out.println("Among a= "+a+" Among b= "+b+" so "+c+" is Large");
		if(c==-1)
		{
			System.out.println("a,b are equal");
		}	
	}
}

package ControlStatement;
import java.util.Scanner;
public class NestedDivisible {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a No.");
		int n=s.nextInt();
		if(n%3==0)
		{
			if(n%5==0)
			{
				System.out.println("Divisible by 5 and 3 ");
			}
			else
			{
				System.out.println("Divisible by 3 but not 5");
			}
		}
		else if(n%5==0)
		{
			System.out.println("Divisible by 5 but not 3");
		}
		else
		{
			System.out.println(" Not Divisible by 3,5");
		}

	}

}

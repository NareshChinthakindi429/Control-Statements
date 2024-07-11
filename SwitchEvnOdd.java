package ControlStatement;
import java.util.Scanner;
public class SwitchEvnOdd {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a No.");
		int  x=s.nextInt();
		switch(x%2)
		{
		case 0:
			System.out.println("Even no.");
			break;
		case 1:
			System.out.println("Odd no.");
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		
	}

}

package ControlStatement;
import java.util.Scanner;
public class NoOfDigit {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any Number");
		int n=s.nextInt();
		if(n>-9 && n<9)
		{
			System.out.println("One Digit Number");
		}
		else if(n>-99 && n<99)
		{
			System.out.println("Two Digit Number");
		}
		else if(n>-999 && n<999)
		{
			System.out.println("Three Digit Number");
		}
		else if(n>-9999 && n<9999)
		{
			System.out.println("Four Digit Number");
		}
		else
		{
			System.out.println(">= five Digit No.");
		}
	}
}

package ControlStatement;

import java.util.Scanner;
import java.util.Scanner;
public class larg3UnikNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int x=s.nextInt();
		System.out.println("Enter 2nd No.");
		int y=s.nextInt();
		System.out.println("Enter 3nd No.");
		int z=s.nextInt();
		if(x>y && x>z)
		{
			System.out.println(x+" is large");
		}
		else if(y>z)
		{
			System.out.println(y+" is Lagre");
		}
		else 
		{
			System.out.println(z+" is Large");
		}

	}

}

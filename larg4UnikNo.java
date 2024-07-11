package ControlStatement;
import java.util.Scanner;
public class larg4UnikNo
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int x=s.nextInt();
		System.out.println("Enter 2nd No.");
		int y=s.nextInt();
		System.out.println("Enter 3nd No.");
		int z=s.nextInt();
		System.out.println("Enter 4th No.");
		int w=s.nextInt();
		if(x>y && x>z && x>w)
		{
			System.out.println(x+" is large");
		}
		else if(y>z && y>w)
		{
			System.out.println(y+" is Lagre");
		}
		else if(z>w)
		{
			System.out.println(z+" is Large");
		}
		else
		{
			System.out.println(w+" is Large");
		}

	}
}

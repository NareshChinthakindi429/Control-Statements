package ControlStatement;
import java.util.Scanner;
public class largeTwoNo 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter first No.");
		int x=s.nextInt();
		System.out.println("Enter second No.");
		int y=s.nextInt();
		if(x>y)
		{
			System.out.println(x+" is large");
		}
		else
		{
			System.out.println(y+" is Lagre");
		}

	}

}

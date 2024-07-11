package ControlStatement;
import java.util.Scanner;
public class psoNegNeut {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a No.");
		int x=s.nextInt();
		
		if(x>0)
		{
			System.out.println(x+" is Positve");
		}
		else if(x<0)
		{
			System.out.println(x+" is Negative");
		}
		else 
		{
			System.out.println(x+" is Neutral");
		}

	}

}

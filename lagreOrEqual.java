package ControlStatement;
import java.util.Scanner;
public class lagreOrEqual {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st No.");
		int x=s.nextInt();
		System.out.println("Enter 2nd No.");
		int y=s.nextInt();
		if(x>y)
		{
			System.out.println(x+" is large");
		}
		else if(x<y)
		{
			System.out.println(y+" is Lagre");
		}
		else if(x==y)
		{
			System.out.println("x,y are equal");
		}
	}
}

package ControlStatement;
import java.util.Scanner;
public class Traingle {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 1st triangle side or Angle");
		int x=s.nextInt();
		System.out.println("Enter 2st triangle side or Angle");
		int y=s.nextInt();
		System.out.println("Enter 3st triangle side or Angle");
		int z=s.nextInt();
		if((x+y+z)==180)
		{
			if(x==y && y==z)
			{
				System.out.println("Equilatral Triangle");
			}
			else if(x!=y && y!=z)
			{
				System.out.println("Scalene Triangle");
			}
			else if(x==y || y==z)
			{
				System.out.println("Isosceles Triangle");
			}
		}
		else
		{
			System.out.println("Please valid triangle sides or angles");
		}
	}

}

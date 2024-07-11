package ControlStatement;
import java.util.Scanner;
public class MenuDriven 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Channel Category\n 1.Sports Channel\n 2.Movies Channel\n 3.Cartoon Channel");
		System.out.println("Enter your choice");
		int n=s.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("You Entered Sports Category\n 1.Star Sports Category\n 2.Song Six package\n 3.Zee Sports package");
			System.out.println("Enter your choice");
			int x=s.nextInt();
			switch(x)
			{
			case 1:
				System.out.println("You are Suscribed to Star Sports Package\n Lets Enjoy !");
				break;
				
			case 2:System.out.println("You are Suscribed to Sony Six Package\n Lets Enjoy !");
				break;
				
			case 3:
				System.out.println("You are Suscribed to Zee Package\n Lets Enjoy !");
				break;
			default :
				System.out.println("Invaild input");
				break;
			}
			break;
		case 2:
			System.out.println("You Entered Sports Category\n 1.B4U Movies Category\n 2.Song max package\n 3.Zee Movies package");
			System.out.println("Enter your choice");
			int y=s.nextInt();
			switch(y)
			{
			case 1:
				System.out.println("You are Suscribed B4U movies Package\n Lets Enjoy !");
				break;
				
			case 2:System.out.println("You are Suscribed to Sony Max Package\n Lets Enjoy !");
				break;
				
			case 3:
				System.out.println("You are Suscribed to Zee Movies Package\n Lets Enjoy !");
				break;
			default :
				System.out.println("Invaild input");
				break;
			}
			break;
			
		case 3:
			System.out.println("You Entered Sports Category\n 1.animal anime Category\n 2.Comic anime package\n 3.lion catroon");
			System.out.println("Enter your choice");
			int z=s.nextInt();
			switch(z)
			{
			case 1:
				System.out.println("You are Suscribed to animal anime Package\n Lets Enjoy !");
				break;
				
			case 2:System.out.println("You are Suscribed to Comic anime Package\n Lets Enjoy !");
				break;
				
			case 3:
				System.out.println("You are Suscribed to lion cartoon Package\n Lets Enjoy !");
				break;
			default :
				System.out.println("Invaild input");
				break;
			}
			break;	
		default:
			System.out.println("Invaild Choice");
		}
	}
}

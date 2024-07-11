package ControlStatement;
import java.util.Scanner;
public class SingleDigitNo {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a No. to check Single Digit Or Not:-");
		int n=s.nextInt();
		if(n>=9 && n<=-9)
		{
			System.out.println("It is single digit No.= "+n);
		}
		else
		{
			 System.out.println("You Not Enter Single Digit NO.");
		}
	}

}

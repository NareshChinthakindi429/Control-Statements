package ControlStatement;
import java.util.Scanner;
public class Payment_module 
{
		public static void main(String[] args)
		{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Woking Hours");
		int work=s.nextInt();
		if(work<=40)
		{
			double payment=(work*(40*83.11));
			System.out.println("Your Payment is= "+payment);
		}
		else if(work>40)
		{
			int extra=work-40;
			double payment1=(40*(40*83.11))+((extra*1.5)*83.11);
			System.out.println("Your Extra "+extra+ " Hours Payment is = "+((extra*1.5)*83.11));
			System.out.println("Your Total Payment is= "+payment1);
			
		}
	}
}

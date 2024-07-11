package ControlStatement;
import java.util.Scanner;
public class discntAmt 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Shopping Amount:-");
		double n=s.nextDouble();
		if(n<500)
		{
			n=(n*95)/100;		//n=n-(n*5/100)
			System.out.println("After Discount Amount is= "+n);
		}
		else if(n>=500 && n<2000)
		{
			n=(n*90)/100;
			System.out.println("After Discount Amount is= "+n);
		}
		else if(n>=2000 && n<4000)
		{
			n=(n*80)/100;
			System.out.println("After Discount Amount is= "+n);
		}
		else if(n>=4000 && n<6000)
		{
			n=(n*70)/100;
			System.out.println("After Discount Amount is= "+n);
		}
		else if(n>6000)
		{
			n=(n*60)/100;
			System.out.println("After Discount Amount is= "+n);
		}
		
		
	}
}

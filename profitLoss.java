package ControlStatement;
import java.util.Scanner;
public class profitLoss {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter cost price");
		double x=s.nextDouble();
		System.out.println("Enter selling price");
		double y=s.nextDouble();
		double profit=y-x;
		double loss=x-y;
		if(profit>0)
		{
			System.out.println("Profit is "+profit);
		}
		else
		{
			System.out.println("Loss is "+loss);
		}
		
		
		
		
}
}
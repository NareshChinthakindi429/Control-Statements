package ControlStatement;
import java.util.Scanner;
public class Medico {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Age");
		int age=s.nextInt();
		System.out.println("Enter your Gender in Male or female");
		String gender=s.next();
		if(age>18)
		{
			if(gender.equals("Female") || gender.equals("female"))
			{
			System.out.println("Eligible for COVACXIN");
			}
		else if(gender.equals("Male") || gender.equals("male"))
		{
			System.out.println("Eligible for COVIDSHIELD");
		}
		}
		else
		{
			System.out.println("Eligible for Children Vaccine");
		}	
	}

}

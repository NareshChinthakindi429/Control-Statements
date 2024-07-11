package ControlStatement;
import java.util.Scanner;
public class VowelSwitch 
{
	public static void main(String []args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any character for checking Vowel or consotant");
		char c=s.next().charAt(0);
		switch(c)
		{
		case   'a','e','i','o','u','A','E','I','O','U':
				System.out.println("Vowel");
				break;
		default :
			    System.out.println("Consonant");
			    break;
			
		}
	}
}

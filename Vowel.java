package ControlStatement;
import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) 
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character for Check Vowel or Consonant");
		char c=s.next().charAt(0);
		if(c=='a' || c=='e'|| c=='i' || c=='o' || c=='u' || 
		   c=='A' || c=='E'|| c=='I' || c=='O' || c=='U')
		{
			System.out.println("You Enter Vowel = "+c);
		}
		else
		{
			System.out.println("You Enter Consonant = "+c);
		}

	}

}

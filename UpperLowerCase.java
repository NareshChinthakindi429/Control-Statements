package ControlStatement;
import java.util.Scanner;
public class UpperLowerCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter character");
		char c=s.next().charAt(0);
		char ch=Character.toUpperCase(c);
		if(c==ch)
		{
			System.out.println("upper");
		}
		else
		{
			System.out.println("lower");
		}
	}

}

// Java Program to find Sum of Even Numbers using While Loop
import java.util.Scanner;

public class SumofEven
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i = 2, evenSum = 0;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		while(i<=number)
		{evenSum = evenSum + i; 
			i = i + 2;
		}
		 System.out.println("\n The Sum of Even Numbers upto " + 
     number + "  =  " + evenSum);
	}
}
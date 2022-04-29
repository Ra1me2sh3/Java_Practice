import java.util.Scanner;

public class SumofOdd
{
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i = 2, oddSum = 0;
		sc = new Scanner(System.in);
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		while(i<=number)
		{oddSum = oddSum + i; 
			i = i + 2;
		}
		 System.out.println("\n The Sum of odd Numbers upto " + 
     number + "  =  " +oddSum);
	}
}
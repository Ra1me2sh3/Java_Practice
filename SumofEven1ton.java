import java.util.Scanner;

class SumofEven1ton {

	 private static Scanner sc;
	 public static void main(String[] args) 
	{
		int number, i,sum=0;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
		i = 2; 
		
		 while(i <= number)
		{
      sum=sum+i;
			System.out.print(sum+"\n"); 
			i = i + 2;
		}	
	}
}
import java.util.Scanner;
class Product
{
      public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        int num, temp;
        int product = 1;
        System.out.println("Enter any number : ");
        num = sc.nextInt();
        temp = num;
        while(temp != 0) 
    {
          product = product * (temp % 10);
           temp = temp / 10;
    }System.out.println("\nProduct of all digits in a num"+product);
 }

}


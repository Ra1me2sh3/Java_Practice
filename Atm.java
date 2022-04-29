import java.util.*;
class Atm
  {
    int balance;
    void withdraw(int amt)
    {
      if(balance>amt)
      {
        balance=balance-amt;
        system.out.println("withdraw successfully");
          system.out.println("deposit successfully");
      }
      else{
        system.out.println("insufficient balance");
      }
    }
    void deposit(int amt){
      balance=balance+amt;
      system.out.println("deposit successfully");
      }
    void checkBalance()
    {
      system.out.println(balance)
        }  
  }
class Bitlabs
  {
    public static void main(string args[])
    {
      scanner sc=new scanner(system.in);
      Atm atm=new Atm();
      Atm balance=100000;
      char ch='y';
      do{
        system.out.println("1.withdraw \n 2.deposit \n 3.check balance");
        system.out.println("select option");
        int option=sc.nextint();
        switch(option)
          {
            case 1:
              system.out.println("enter amount");
              int amount=sc.sc.nextint();
              break;
            case 2:
              system.out.println("enter amount")
                int amount=sc.nextint;
              atm deposit(amount);
                break;
            case 3:
              atm.checkBalance();
              break;
              default;
              system.out.println("invalid");
          }
        system.out.println("do you want to continue");
        ch=sc.next().charAt(0);
        
          }
        while(ch=='y')
      }
    }
  
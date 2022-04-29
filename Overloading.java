import java.util.*;
class Addtion
  {
  int add(int a,int b)
    {
return(a+b);
}
    int add(int a,int b,int c)
  {
    return(a+b+c);
  }
    double add(double a,double b)
  {
    return(a+b);
    }
  }
class Overloading
  {
    public static void main(String args[])
    {
      Addtion a=new Addtion();
      int x=a.add(2,3);
      int y=a.add(2,3,4);
      double z= a.add(2.3,4.5);
      System.out.print(x+" "+y+" "+z);
      }
    }
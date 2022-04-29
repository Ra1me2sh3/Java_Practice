import java.util.Scanner;
class Person
  {
      String name;
    
  }
{
      system.out.println(name);
}
      class student extends  person
  {
       String branch;
  }
{
      system.out.println(branch);
}

      class graduate extends student{
       float percentage;{
        System.out.println(percentage);
      }
      
    }
      class postgraduate extends student
    {
      String dept;
      {
        System.out.println(dept);
      }
    }
      class employee extends person

{
      String id;
}{
      system.out.println(id);
}
      class faculty extends employee
  {
       int salary;
  }
{
      System.out.println(salary);
}
      class staff extends employee
  {
    String designation;
    
  }
{
     System.out.println(designation);
}
    class Hie
  {
    public static void main()
    {
      student st=new student();
      st.name="ram";
      st.branch="ece";
      }
    }
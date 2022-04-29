import java.util.Scanner;
class Student
  {
    private int eid;
    private String ename;
    private String edep;
    private double esalary;
    void setEid(int eid)
    {
     this.eid=eid;
}
    int getEid()
  {
    return this.eid;
  }
    void setEName(String ename)
  {
    this.ename=ename;
  }
     String getEName()
  {
     return this.ename;
  }
    void setEdep(String edep)
    {
      this.edep=edep;
      }
    String getEdep()
      {
        return this.edep;
      }
    void setESalary(double esalary)
    {
      this.esalary=esalary;
    }
   double getEsalary()
    {
      return this.esalary;
    }
    
    }

   class Employee
   
  {
    public static void main (String args[])
    {
      Scanner sc=new Scanner(System.in);
      Student st=new Student();
      System.out.println("enter Eid");
      st.setEid(sc.nextInt());
      System.out.println("enter Ename");
      st.setEName(sc.next());
      System.out.println("enter Edep");
      st.setEdep(sc.next());
      System.out.println("enter Esalary");
      st.setESalary(sc.nextDouble());
      System.out.println(st.getEid()+" "+st.getEName()+" "+st.getEdep()+" "+st.getEsalary());
    }
 }

package person;
public class Employee extends Person
{
    String office;
    int salary;
    MyDate date=new MyDate();

    public Employee(String off,int sal)
    {
        super();
        this.office=off;
        this.salary=sal;
    }
    
    
    void ToString()
    {
         System.out.println("\n\nThe ClassName Is Empolyee\nThe Person Name Is "+name+"\nThe Office Is "+office+"\nThe Salary Is "+salary+"\nMy Date Is "+date.day+" / "+date.month+" / "+date.year);    
    }
}

package person;
public class Faculty extends Employee
{
    String rank ;
    int officeHours ;

    public Faculty(String ran,int offh) 
    {
        super(null, 0);
        this.rank=ran;
        this.officeHours=offh;
    }

    
  
    
    
    void ToString ()
    {
        System.out.println("\n\nThe ClassName Is Faculty\nThe Person Name Is "+super.name+"\nThe Rank Is "+rank+"\nThe Office Hours are "+officeHours);
    } 
}

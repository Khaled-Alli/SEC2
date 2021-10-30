package person;
public class Staff extends Employee
{
    String title ;

    public Staff(String tit) {
        super(null, 0);
        this.title=tit;
    }

    
    
    
    
    void ToString ()
    {
        System.out.println("\n\nThe ClassName IS Staff\nThe Person Name Is "+super.name+"\nThe Title Is "+title);
    }
}

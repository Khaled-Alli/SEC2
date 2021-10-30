package person;
public class Person 
{
   String name;
   String address;
   int  phoneNumber;
   String emailAddress;

   Person()
    {
        this.name="Khaled Ali";
        this.address="Samalout";
        this.emailAddress="Alik84386@gmail.com";
        this.phoneNumber=12345;
        
    }
   
   
   
   void ToString ()
   {
       System.out.println("The ClassName IS Person\nThe Person Name Is "+name+"\nThe Address Is "+address+"\nThe phoneNumber Is "+phoneNumber+"\nThe EmailAddress Is "+emailAddress);
   }
   
}

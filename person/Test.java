package person;
public class Test {

    public static void main(String[] args)
    {
      Person p=new Person();
      p.ToString();
      
       Employee e=new Employee("Engineer",12345);
       e.ToString();
       
       Student s=new Student();
       s.ToString();
      
       Faculty f=new Faculty("3",36);
       f.ToString();
       
      Staff st=new Staff("CIO");
       st.ToString();
    }
    
}

package Student;
public class Test {

    public static void main(String[] args)
    {
        Subject sub=new Subject(456, "Software Development", 50);
        Address addr=new Address(789, "Minia", "Egypt");
        Student st =new Student("Khaled Ali",123, 2.65,addr,sub);
        
        
        st.printStudentInf();
    }
    
}

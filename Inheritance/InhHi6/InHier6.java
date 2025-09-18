package Inheritance.InhHi6;
public class InHier6 {
    public static void main(String[] args){
        Student st=new Student();
        Teacher t=new Teacher();
        Staff sf=new Staff();

        st.memberDetails();
        st.study();
        t.memberDetails();
        t.teach();
        sf.memberDetails();
        sf.work();
    }
}

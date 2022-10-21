package Reference.Constructor;

public class ConsMain {
    public static void main(String[] args) {

        Provider provider = Student::new;
        /*
        * Provider provider = ()->{
        *   return new Student();                     Can Be Done Like This Also
        * };
        * */

        Student student = provider.getStudent();
        student.display();
    }
}

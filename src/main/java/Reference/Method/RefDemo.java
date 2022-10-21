package Reference.Method;

public class RefDemo {

    public static void main(String[] args) {

        // By Anonymous class
        WorkInter workInter = new WorkInter() {
            @Override
            public void doTask() {
                System.out.println("It's by anonymous class");
            }
        };

        workInter.doTask();

        // By Lambda Expression

        WorkInter workInter1 = ()->{
            System.out.println("It's by lambda expression");
        };

        workInter1.doTask();

        // By Reference

        WorkInter workInter2 = Stuff::stuff;
        workInter2.doTask();

        WorkInter workInter3 = Stuff::stuff2;
        workInter3.doTask();

        Stuff stuffObject = new Stuff();
        WorkInter workInter4 = stuffObject::printNumber;

        workInter4.doTask();
    }
}

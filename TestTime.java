package java_qap1;

public class TestTime {
    public static void main(String[] args) {
        Time t1 = new Time(0, 0, 0);
        Time t2 = new Time(0, 0, 0);
        t1.setTime(15, 10, 21);
        t2.setTime(25, 20, 10);

        t1.nextSecond();
        t2.previousSecond();
        System.out.println("t1 = " + t1.toString());
        System.out.println("t2 = " + t2.toString());
    }
}

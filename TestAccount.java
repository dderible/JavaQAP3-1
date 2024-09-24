package java_qap1;

public class TestAccount {
    public static void main(String[] args) {

        Account Acc1 = new Account("JC1960","JC", 5000);
        Account Acc2 = new Account("DD2003", "Declan", 4000);

        System.out.println(Acc1.getID() + " Account Balance = " + Acc1.getBalance());
        System.out.println(Acc2.getID() + " Account Balance  = " + Acc2.getBalance());

        Acc1.transferTo(Acc2, 1000);

        System.out.println(Acc1.getID() + " Account Balance = " + Acc1.getBalance());
        System.out.println(Acc2.getID() + " Account Balance  = " + Acc2.getBalance());
    }
}

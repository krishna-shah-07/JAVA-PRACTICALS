import java.util.*;

class Account_1 {
    double balance = 100;
    int[] Acco = new int[10];

    void data() {
        System.out.println();
        System.out.println("1.Deposit");
        System.out.println("2.Widthdraw");
        System.out.println("3.GetMonthlyInterestRate");
        System.out.println();
    }
}

class Pr3 {
    public static void main(String[] args) {
        Account_1 a = new Account_1();
        Account ac = new Account();
        try (Scanner sc = new Scanner(System.in)) {
            int i;
            for (i = 1; i < a.Acco.length; i++) {
                a.Acco[i-1] = i;
            }
            System.out.println("Enter Your Account Number :  ");
            int k = sc.nextInt();
            if (k != a.Acco[i]) {
                System.out.println("Please Enter A Valid ID*");
            } else {
                a.data();
                for (int j = 1; j >= 1; j++) {
                    System.out.println("Enter Your Input : ");
                    int m = sc.nextInt();
                    switch (m) {
                        case 1:
                            ac.deposit();
                            a.data();
                            continue;
                        case 2:
                            ac.withdraw();
                            a.data();
                            continue;
                        case 3:
                            ac.getMonthlyInterestRate();
                            a.data();
                            continue;
                        case 99:
                            break;
                        default:
                            System.out.println(":: 404 The Error Accurs ::");

                    }
                }
            }
        }
    }
}
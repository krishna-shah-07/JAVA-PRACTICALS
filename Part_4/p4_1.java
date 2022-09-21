import java.util.*;

public class p4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //static values
        int x = 10;
        int y = 6;
        int[] z = {5, 2, 0};

        //outer try block
        try {
            System.out.println("Try block 1 ");
            //inner try block
            try {
                System.out.println("Try block 2 ");
                z[3] = 50;
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException found.");
            }
            z[2] = y / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException found.");
        }
        
        System.out.println("Exit from program.");
    }
}
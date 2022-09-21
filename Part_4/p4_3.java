import java.util.*;

public class p4_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 5;
        int[] c = {1,2,3,4};
        try{
            c[b] = c[1]/a;
            //ArithmeticException occurs here as a is 0
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException Occurred."); 
        }

        a=1;

        try{
            c[b] = c[1]/a; 
            //ArrayIndexOutOfBoundsException occurs here as 5 index not there 
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Occurred.");
        }
        finally {
            System.out.println("Exception handled Successfully By try and catch block.\nMessage from finally block.");
        }
    }
}
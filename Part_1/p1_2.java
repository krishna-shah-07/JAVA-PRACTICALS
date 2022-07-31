import java.util.*;
public class p1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //take input of string
        System.out.println("Enter String to Check : ");
        String a = sc.next();

        //calling function to check starting of string
        startOZ(a);
        sc.close();
    }

    public static void startOZ(String x){
        //to print if it starts with O/o
        if(x.charAt(0) == 'O' || x.charAt(0) == 'o'){
            System.out.println(x.charAt(0));
        }

        //to print if 2nd letter is Z/z
        if(x.charAt(1) == 'Z' || x.charAt(1) == 'z'){
            System.out.print(x.charAt(1));
        }
    }
}
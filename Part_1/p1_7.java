import java.util.*;
public class p1_7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //take input for number of rows
        System.out.print("Number of rows : ");
        int r = sc.nextInt();
        int num = 0;
        
        //code to print the pattern
        for(int i = 0 ; i  <= r ; i++){
            //spaces
            for(int j = 1 ; j <= r-i ; j++){
                System.out.print(" ");
            }
            //till mid term
            for(int j = 0 ; j <= i ; j++){
                num = (int)Math.pow(2,j);
                System.out.print(num);
            }
            //after mid term
            for(int j = i-1 ; j >= 0 ; j--){
                num = (int)Math.pow(2,j);
                System.out.print(num);
            }
            //next line
            System.out.println();
        }
        sc.close();
    }
}
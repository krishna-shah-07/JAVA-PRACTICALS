import java.util.*;
public class p1_9{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] Sudoko = new int[9][9];
        int ans = 0 ;
        //to take input 
        System.out.println("Values in Sudoku : ");
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                Sudoko[i][j] = sc.nextInt();
            }
        }
        
        //checking if answer is correct
        for(int i = 0 ; i < 9 ; i++){
            for(int j = 0 ; j < 9 ; j++){
                //perform binary XOR
                ans = ans ^ Sudoko[i][j];
            }
        }
        
        //print the conclusion
        if(ans == 1){
            System.out.println("CORRECT");
        }else{
            System.out.println("NOT CORRECT");
        }
        sc.close();
    }
}
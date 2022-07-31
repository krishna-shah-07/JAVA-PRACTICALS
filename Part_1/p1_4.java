import java.util.*;
public class p1_4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		//declare an array of intergers
		int[] arr = new int[n1];
		int flag = 0;
		
		//for loop to take input and check
		for(int i = 0 ; i < n1 ; i++){
		    arr[i] = sc.nextInt();
		    if(i > 1){
		        if(arr[i] == 3){
		            if(arr[i-1] == 2){
		                if(arr[i-2] == 1){
		                    //set flag as 1 if 1,2,3 exist
		                    flag = 1;
		                }
		            }
		        }
		    }
		}
		
		//return true if flag is 1 else false
		if(flag == 1){
		    System.out.println("true");
		}else{
		    System.out.println("false");
		}
		sc.close();
	}
}
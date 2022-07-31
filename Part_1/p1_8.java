import java.util.*;
public class p1_8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    
		//Answers of students in a 2D array
		char[][] stdAns = new char[][] {{'A','B','A','C','C','D','E','E','A','D'} , 
			{'D','B','A','B','C','A','E','E','A','D'} , 
			{'E','D','D','A','C','B','E','E','A','D'} , 
			{'C','B','A','E','D','C','E','E','A','D'} , 
			{'A','B','D','C','C','D','E','E','A','D'} , 
			{'B','B','E','C','C','D','E','E','A','D'} ,
			{'B','B','A','C','C','D','E','E','A','D'} ,
			{'E','B','E','C','C','D','E','E','A','D'} };
    
		//Answer key array
		char[] Ans = new char[] {'D','B','D','C','C','D','A','E','A','D'};
    
		//Store count correct answer in array
		int[] Marks = new int[8];
		for(int i = 0 ; i < 8 ; i ++ ) {
			for(int j = 0 ; j < 10 ; j ++) {
				if(stdAns[i][j] == Ans[j]) {
					Marks[i]++;
				}
			}
		}
    
    //finally print those number of correct answers
		System.out.println("Number of Correct Answers(out of 10) - ");
		for(int i = 0 ; i < 8 ; i ++ ) {
			System.out.println("For student " + (i+1) + " : " + Marks[i]);
		}
		sc.close();
	}
}
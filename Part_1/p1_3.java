package com.test;
import java.util.*;
public class p1_3 {
  //The main part
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
    
    //take input of 2 numbers
		int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    
    //print the output
    System.out.println(LastDigit(n1, n2));
		sc.close();
	}
  
  //the function to compare last digits
  public static boolean LastDigit(int a, int b){
    //comparing last digits using modulo 10
	    if((a % 10) == (b % 10)){
	        return true;
	    }else{
	        return false;
	    }
	}
}
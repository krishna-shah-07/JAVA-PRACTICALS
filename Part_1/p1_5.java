import java.util.*;
public class p1_5{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //take input of two strings
        System.out.print("Enter 1st String : ");
        String s1 = sc.next();
        System.out.print("Enter 2nd String : ");
        String s2 = sc.next();
        
        //calling stringMatch function
        stringMatch(s1, s2);
        sc.close();
    }
    
    public static void stringMatch(String a, String b){
        //initialising the var for count
        int cnt = 0;
        int l;
        
        //comparing length to use in for loop
        if(a.length() > b.length()){
            l = b.length();
        }else{
            l = a.length();
        }
        
        //for loop to compare substrings
        for(int i = 0 ; i <  l-1 ; i++){
            String x = a.substring(i , i+2);
            String y = b.substring(i , i+2);
            if(x.equals(y)){
                //increment count if match found
                cnt++;
            }
        }
        
        //print the count
        System.out.println(cnt);
    }
}
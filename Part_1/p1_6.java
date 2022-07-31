import java.util.*;
public class p1_6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //take input of initial string 
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        String str[] = new String[n];
        System.out.print("Enter elements : ");
        for(int i = 0 ; i < str.length ; i++){
            str[i] = sc.next();
        }
        
        //the target string to remove
        System.out.print("To remove : ");
        String rem = sc.next();
        
        //calling the function to print new String
        wordsWithout(str, rem);
        sc.close();
    }
    
    public static void wordsWithout(String a[], String b){
        int cnt = 0, j = 0;
        //counting the number of similar elements
        for(int i = 0; i < a.length ; i++){
            if(a[i].equals(b)){
                cnt++;
            }
        }
        
        //copying the different elements in the final String
        String[] fin = new String[a.length - cnt];
        for(int i = 0; i < a.length ; i++){
            if(a[i].equals(b)){}
            else{
                fin[j] = a[i];
                j++;
            }
        }
        
        //printing the final String
        for(String ele:fin){
            System.out.print(ele + " ");
        }
    }
}
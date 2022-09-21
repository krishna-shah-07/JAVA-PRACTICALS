import java.util.*;

public class p4_2 {
    //class for custom made exception
    static class InvalidAgeLimit extends Exception{
        InvalidAgeLimit(String age){
            super(age); //calling the super class constructor
        }
    }

    public static void main(String[] args) throws InvalidAgeLimit{
        int Age;
        Scanner sc = new Scanner(System.in);
        Age=sc.nextInt();
        if(Age>=18){
            System.out.println("You're eligible for driving license");
        }
        else {
            //try catch block 
            try{
                //using custom exception 
                throw new InvalidAgeLimit("You're not eligible for driving license");
            }
            catch(InvalidAgeLimit e){
                System.out.println(e.getMessage());
            }
        }
    }
}
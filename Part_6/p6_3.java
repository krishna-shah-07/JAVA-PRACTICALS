import java.util.*;

//class that extends Thread
class Increment extends Thread{
    int sec;

    //parameterised constructor
    Increment(int sec){
        this.sec = sec;
    }

    public void run(){
        sec += 1;
        try{
            sleep(1000); //to display after 1 sec
        }catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("After incrementation : " + sec);
    }
}

public class p6_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int t = sc.nextInt();

        //creating object of thread and begin execution 
        Thread t1 = new Increment(t);
        t1.start();
        sc.close();
    }
}
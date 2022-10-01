import java.util.*;

public class p6_4 extends Thread{
    public void run(){
        System.out.println("Execution running : " + this.getPriority());
    }

    public static void main(String[] args){
        //creation of threads
        p6_4 FIRST = new p6_4();
        p6_4 SECOND = new p6_4();
        p6_4 THIRD = new p6_4();

        //setting the priority
        FIRST.setPriority(3);
        SECOND.setPriority(5); //default
        THIRD.setPriority(7);

        //running the threads
        SECOND.start();
        FIRST.start();
        THIRD.start();
    }
}
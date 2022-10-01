import java.util.*;

class ExThread extends Thread{
    public void run(){
        System.out.println("Hello World");
    }
}

public class p6_1 implements Runnable{
    public void run(){
        System.out.println("Hello World");
    }

    //main method
    public static void main(String[] args){
        //calling using object of class that implements Runnable
        p6_1 obj = new p6_1();
        obj.run();

        System.out.println();

        //calling using object of class that extends Thread
        ExThread obj2 = new ExThread();
        obj2.start();
    }
}
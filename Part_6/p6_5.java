import java.util.*;

class Producer extends Thread{
    StringBuffer buffer;
    Producer(){
        //static value 4 choosen for example 
        buffer = new StringBuffer(4);
    }

    //the buffer is appended with i till full i.e. fully produced
    public void run(){
        for(int i = 0 ; i < 4 ; i++){
            try{
                buffer.append(i);
                System.out.println("Produced : " + i);
            }catch(Exception e){
                e.printStackTrace();
            }
        }

        System.out.println("Buffer id full");
        Consumer c = new Consumer(this);
    }
}

class Consumer extends Thread{
    Producer p;
    Thread t1;
    Consumer(Producer temp){
        p = temp;
        t1 = new Thread(this);
        t1.start();
    }

    //the values one by one are talen till last i.e. empty
    public void run(){
        try{
            for(int i = 0 ; i < 4 ; i++){
                System.out.println(p.buffer.charAt(i) + " ");
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("Buffer is empty");
    }
}

class p6_5{
    public static void main(String[] args){

        //making object of producer
        Producer p = new Producer();

        //making an object of thread with object of producer as argument
        Thread t = new Thread(p);

        //execution begins
        t.start();
    }
}
import java.util.*;

interface P{
    void display();
}

interface P1 extends P{
    void show1();
}

interface P2 extends P{
    void show2();
}

//interface P12 that extends both the previous interfaces
interface P12 extends P1, P2{
    void PRINT();
}

//public class that implements the interface P12
public class p3_3 implements P12{
    public void display(){
        System.out.println("Method in P called");
    }

    public void show1(){
        System.out.println("Method in P1 called");
    }

    public void show2(){
        System.out.println("Method in P2 called");
    }

    public void PRINT(){
        System.out.println("Method in P12 called");
    }

    //main method by making object of class p3_3
    public static void main(String[] args){
        p3_3 obj = new p3_3();
        obj.display(); //from P

        obj.show1(); //from P1

        obj.show2(); //from P2
        
        obj.PRINT(); //from P12
    }
}
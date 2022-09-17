//interface with a default method
interface MyInterface{
    public void square(int l);

    default void show(){
        System.out.println("Default method shoe called");
    }
}

public class p3_7 implements MyInterface{
    public void square(int l){
        System.out.println(l * l);
    }

    public static void main(String[] args){
        p3_7 obj = new p3_7();
        obj.suare(2);
        obj.show(); //calls default method
    }
}
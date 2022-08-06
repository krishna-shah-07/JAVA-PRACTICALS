import java.util.*;
public class p2_5{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        //creating object of DemoOverlloading
        DemoOverloading d1 = new DemoOverloading();

        //calling method with no input
        System.out.println("Sum 1 : " + d1.add()); //---> 2

        //calling method with 1 input
        System.out.println("Sum 2 : " + d1.add(3)); //---> 4

        //calling method with 2 inputs
        System.out.println("Sum 3 : " + d1.add(3, 4)); //---> 7

        sc.close();
    }
}

class DemoOverloading{
    //default values 1
    private int num1 = 1;
    private int num2 = 1;

    public int add(){
        return (num1 + num2);
    }

    public int add(int num1){
        this.num1 = num1;
        return (num1 + num2);
    }

    public int add(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        return (num1 + num2);
    }
}
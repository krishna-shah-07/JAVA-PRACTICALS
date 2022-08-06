import java.util.*;
public class p2_1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //circle 1 with default radius 1
        Circle c1 = new Circle();
        System.out.println("Circle 1 : ");
        System.out.println("Area is : " + c1.getArea());
        System.out.println("Perimeter is : " + c1.getPerimeter());

        //circle with radius 7
        Circle c2 = new Circle(7);
        System.out.println("Circle 2 : ");
        System.out.println("Area is : " + c2.getArea());
        System.out.println("Perimeter is : " + c2.getPerimeter());
        sc.close();
    }
}

//class circle
class Circle{
    private double radius;

    //default constructor
    public Circle(){
        radius = 1;
    }

    //parameterised constructor
    public Circle(double radius){
        this.radius = radius;
    }

    //method to get area
    public double getArea(){
        return (3.14 * radius * radius);
    }

    //method to get perimeter
    public double getPerimeter(){
        return (2 * 3.14 * radius);
    }
}
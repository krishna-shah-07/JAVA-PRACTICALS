import java.util.*;

//Super class GeometricObject
abstract class GeometricObject{	
	//abstract methods
	public abstract double getArea();
	public abstract double getPerimeter(); 
}

//Sub class Triangle
class Triangle extends GeometricObject{
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    //default constructor
    Triangle(){
        System.out.println("Default Triangle Created");
    }

    //parameterised constructor
    Triangle(double side1 , double side2 , double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        System.out.println("Triangle Created");
    }

    //accessor method for 3 sides
    public double getS1(){
        return side1;
    }
    public double getS2(){
        return side2;
    }
    public double getS3(){
        return side3;
    }

    //method getArea()
    public double getArea(){
        double s = (side1 + side2 + side3) / 2;
        double A = s*(s-side1)*(s-side2)*(s-side3);
        return Math.sqrt(A);
    }

    //method getPerimeter()
    public double getPerimeter(){
        return (side1 + side2 + side3);
    }

    //toString method
	public String toString() {
		return ("Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3);
	}
}

//demo class 
public class Pr6{
    public static void main(String[] args){
        Triangle t = new Triangle();
        System.out.println("Perimetre : " + t.getPerimeter());
        System.out.println("Area : " + t.getArea());
        System.out.println(t.toString());
    }
}
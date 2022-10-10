import java.util.*;

class RegularPolygon{
    private int n = 3; //number of sides
    private double side = 1; //length of side
    private double x = 0; //x-coordinate of centre
    private double y = 0; //y-coordinate of centre

    //default constructor
    RegularPolygon(){
        System.out.println("Default Polygon Created");
    }

    //parameterised constructor 1
    RegularPolygon(int n , double side){
        this.n = n;
        this.side = side;
        System.out.println("Polygon created with given side " + n + " and length " + side);
    }

    //parameterised constructor 2
    RegularPolygon(int n , double side, double x, double y){
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
        System.out.println("Polygon created");
    }

    //accessor method
    public int getN(){
        return n;
    }
    public double getSide(){
        return side;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }

    //mutator method
    public void setN(int n){
        this.n = n;
    }
    public void setSide(double side){
        this.side = side;
    }
    public void setX(double x){
        this.x = x;
    }
    public void setY(double y){
        this.y = y;
    }

    //Perimetre
    public double getPerimeter(){
        return (n*side);
    }

    //Area
    public double getArea(){
        double ang = 3.1415/n;
        return ((n*side)/(4*Math.tan(ang)));
    }
}

public class Pr2{
    public static void main(String[] args){
        RegularPolygon r = new RegularPolygon(4,1);
        double a = r.getArea();
        System.out.println("Area : " + a); 

        double p = r.getPerimeter();
        System.out.println("Perimetre : " + p);
    }
}
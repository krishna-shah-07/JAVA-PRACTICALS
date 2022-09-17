import java.util.*;

public class p3_1 {
	public static void main(String args[]) {
		GeometricObject Circle1 =   new   Circle(7);
		GeometricObject Rect1 =   new   Rectangle(3, 4);
		System.out.println(equalArea(Circle1, Rect1));
		displayGeometricObject(Circle1);
		displayGeometricObject(Rect1);
	}
	
	//method to compare area
	public static boolean equalArea(GeometricObject o1,  GeometricObject o2){
		return   o1.getArea() == o2.getArea();
	}
	
	public static void displayGeometricObject(GeometricObject o){
		System.out.println("The area is "+ o.getArea());
		System.out.println("The perimeter is "+ o.getPerimeter());
	}

}

abstract class GeometricObject{
	//private data members
	private String color;
	private boolean filled;
	private Date dateCreated;
	
	//default constructor
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	//Parameterized constructor
	protected GeometricObject(String a, boolean b) {
		color = a;
		filled = b;
	}
	
	//getter methods for color, filled and date created
	public String getColor() {
		return color;
	}
	public boolean isFilled(){
		return filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	//setter methods for color and filled
	public void setColor(String color) {
		this.color = color;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	//toString method
	public String toString() {
		return ("created on "+dateCreated+"\ncolor: "+color +" and filled: "+filled);
	}
	
	//abstract methods
	public abstract double getArea();
	public abstract double getPerimeter(); 
}

class Circle extends GeometricObject{
	private double radius;
	
	//Parameterized constructor
	protected Circle(double radius) {
		this.radius = radius;
	}
	
	//Calling base class constructor using super
	protected Circle(double radius, String color, boolean filled){
		super(color, filled);
		this.radius = radius;
	}
	
	//getter and setter method
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	//get Diameter
	public double getDiameter() {
		return (2 * radius);
	}
	
	//defining abstract class methods
	public double getArea() {
		return (3.14 * radius * radius);
	}
	public double getPerimeter() {
		return(2 * 3.14 * radius);
	}
}

class Rectangle extends GeometricObject{
	private double width;
	private double height;
	
	//Parameterized constructor
	protected Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	//Calling base class constructor using super
	protected Rectangle(double width, double height, String color, boolean filled){
		super(color, filled);
		this.width = width;
		this.height = height;
	}
	
	//getter method
	public double getWidth() {
		return width;
	}
	public double getHeight() {
		return height;
	}
	
	//setter method
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	//defining abstract class methods
	public double getArea() {
		return (width * height);
	}
	public double getPerimeter() {
		return(2 * (width + height));
	}
}
interface Colorable {
    static void howToColor() {}
}

abstract class GeometricObject implements Colorable {
    static void howToColor() {
        System.out.println("Color all the 4 sides");
    }
    public abstract void area();
}

class Square extends GeometricObject {
    private double side1 = 0;

    //default constructor
    Square() {
        System.out.println("Default Square created");
    }

    //getter and setter method 
    public double getside1() {
        return side1;
    }
    public void setside1(double side1) {
        this.side1 = side1;
    }

    //area calculate over-ride
    public void area() {
        System.out.println("The area of square is : " + side1 * side1);
    }
}

class Pr9 extends Square {
    public static void main(String[] args) {
        Square s = new Square();
        s.setside1(10);
        System.out.println("Side : " + s.getside1());
        s.area();
    }
}
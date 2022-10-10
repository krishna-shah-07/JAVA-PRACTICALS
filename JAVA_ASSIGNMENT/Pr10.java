//interface that has compareTo method
interface comparable{
    public void compareTo(double x, double y);
}

class square{
    protected double s;
    
    square(double s){
        this.s = s;
    }

    public double gets(){
        return s;
    }
    public void sets(double s){
        this.s = s;
    }

    public double area(){
        return s*s;
    }
}

//compare square class that defines compareTo method
class CompareSquare extends square implements comparable{
    //create a square 
    CompareSquare(double s){
        super(s);
    }
    
    public void compareTo(double x, double y){
        if(x == y){
            System.out.println("Same area");
        }else if(x > y){
            System.out.println("1st has more area");
        }else{
            System.out.println("2nd has more area");
        }
    }
}

public class Pr10{
    public static void main(String[] args){
        CompareSquare s = new CompareSquare(1);
        System.out.println("Area : " + s.area()); //area of square --> 1
        s.compareTo(4,2); //1st has more area
    }
}
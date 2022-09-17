//To show method over-riding concept

class superClass{
    public void override(){
        System.out.println("Super Class method");
    }
}

class subClass extends superClass{
    public void override(){
        //super.override(); to call super class methods
        System.out.println("Sub Class method");
    }
}

public class p3_4{
    public static void main(String[] args){
        subClass obj = new subClass();
        obj.override();
    }
}
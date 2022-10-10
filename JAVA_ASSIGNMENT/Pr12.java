class Association<T1,T2>{
    T1 obj1;
    T2 obj2;

    Association(T1 obj1, T2 obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
}

class Transition<T1,T2,T3>{
    T1 obj1;
    T2 obj2;
    T3 obj3;

    Transition(T1 obj1, T2 obj2, T3 obj3){
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }
}

class Pr12{
    public static void main(String[] args){
        Association<String, Integer> a = new Association("One" , 1);
        System.out.println(a.obj1 + " " + a.obj2);

        Transition<String, Integer, Float> t = new Transition("Two" , 2 , 2.2);
        System.out.println(t.obj1 + " " + t.obj2 + " " + t.obj3);
    }
}
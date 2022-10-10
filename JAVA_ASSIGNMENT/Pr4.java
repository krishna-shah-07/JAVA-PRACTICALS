import java.util.*;

class Queue{
    private int[] elements;
    private int size;

    Queue(){
        elements = new int[8];
        size = 0;
        System.out.println("Queue created with capacity 8");
    }

    public void enqueue(int v){
        // List<Integer> al = new ArrayList<Integer>(Arrays.asList(elements));
        // al.add(v);
        // elements = al.toArray(elements);

        if(size >= elements.length){
            int[] temp = elements;
            elements = new int[size*2];
            for (int i = 0; i < temp.length; i++){
                elements[i] = temp[i];
            }
            elements[size] = v;
        }else{
            elements[size] = v;
        }
        size++;
    }

    public int dequeue(){
        int v = -1;
        if (empty() == true){
            System.out.println("queue is empty");
        }else{
            v = elements[0];
            for(int i =1; i < elements.length; i++){
                elements[i-1] = elements[i];
            }
            size = size - 1;
        }
        return v;
    }

    public boolean empty(){
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public void getSize(){
        System.out.println(size);
    }
}

public class Pr4{
    public static void main(String[] args){
        Queue q1 = new Queue();
        q1.enqueue(7);
        q1.enqueue(5);
        q1.getSize();
        System.out.println("Element removed : " + q1.dequeue());
        System.out.println("Element removed : " + q1.dequeue());
        q1.dequeue();
    }
}
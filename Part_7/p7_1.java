import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//the class need not be generic only methods
public class p7_1 {

    //comparing and swapping the elements
    private <E> void swap(E[] a, int i, int j) {
        if (i != j) {
            E temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }
    }

    //element type should be passed to comparable
    public <E extends Comparable<E>> void selectionSort(E[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            // find index of smallest element
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j].compareTo(a[smallest])<=0) {
                    smallest = j;
                }
            }

            swap(a, i, smallest);  // swap smallest to front
        }
    }

    public static void main(String[] args){
        p7_1 firstsort = new p7_1();

        //example of sorting a string array
        String[] arr1= {"acd","ded","dal","bad","cle"};
        System.out.println("before sorting String: " + Arrays.toString(arr1));

        //sorting the array
        firstsort.selectionSort(arr1);
        System.out.println("After sorting String : " + Arrays.toString(arr1));
    }
}
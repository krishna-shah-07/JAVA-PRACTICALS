import java.io.*;
import java.util.*;

public class Pr13 {
    // function to sort the array of students using bubble sort 
    public static void sortArray(String[] student, int k) {
        for (int i = 0; i < k - 1; i++) {
            for (int j = 0; j < k - i - 1; j++) {
                if (student[j].compareTo(student[j + 1]) > 0) {
                    String temp = student[j];
                    student[j] = student[j + 1];
                    student[j + 1] = temp;
                }
            }
        }

        // print the student array in ascending order
        for (int i = 0; i < k; i++) {
            System.out.println(student[i]);
        }
    }

    public static void main(String[] args) {
        // an string array to store the names of student
        String student[] = new String[500];
        int counter = 0;
        try {
            // loop to read all the file names given as command line arguments
            for (int i = 0; i < args.length; i++) {
                File file = new File(args[i]);
                Scanner scnr = new Scanner(file);
                while (scnr.hasNextLine()) {
                    String line = scnr.nextLine();
                    int flag = 0;
                    for (int j = 0; j < counter; j++) {
                        if (line.compareTo(student[j]) == 0) {
                            flag = 1;
                            break;
                        }
                    }
                    if (flag == 0) {
                        student[counter] = line;
                        counter++;
                    }
                }
            }
            System.out.println("Ascending order : ");
            sortArray(student, counter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
import java.util.*;
import java.io.*;

public class p5_5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int random[] = new int[15];
        //creating new file
        File file  = new File("Even.txt");
        for (int i = 0; i < 15; i++) {
            random[i] = sc.nextInt();
            //Open the file in append mode
            FileWriter wr = new FileWriter(file, true);
            if(random[i] % 2 == 0){
                wr.write(random[i] + " "); //append the file
            }
            wr.close();
        }
        
        //opening file in reader mode
        FileReader fr = new FileReader(file);
        int k;
        while ((k = fr.read()) != -1){
            System.out.print((int)k);
        }
    }
}
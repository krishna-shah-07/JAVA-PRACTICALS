import java.util.*;
import java.io.*;
 
public class Pr8 {
    public static void main(String[] args) throws Exception {
        //if in Commandline Argument we didn't give file it will not execute this program
        //file1.txt
        if (args.length < 1) {
            System.out.println("Please specify a path");
            System.exit(1);
        }
 
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("File Does not exist");
            System.exit(2);
        }

        //here we initialized all value zero
        Scanner sc = new Scanner(file);
        long charCount = 0L;
        int linesCount = 0;
        int wordsCount = 0;
 
        while(sc.hasNext()) {
            String line = sc.nextLine();
            //here we Applied logic for counting the lines,words etc....
            String[] wordArr = line.split(" ");         
 
            charCount += line.length();
            linesCount += 1;
            wordsCount += wordArr.length;
        }
        System.out.println("File has "+charCount+" characters "+wordsCount+" words "+linesCount+" lines");
    }
}
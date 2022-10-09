import java.io.*;
public class p5_1 {
    public static void main(String[] args) {
        String path = "";  
        boolean bool = false;  
        try {  
            // createing  new files  
            File file  = new File("testFile1.txt");  
            file.createNewFile();  
            // createing new canonical from file object  
            File file2 = file.getCanonicalFile();  
            // returns true if the file exists  
            System.out.println(file2);  
            bool = file2.exists();  
            // returns absolute pathname  
            path = file2.getAbsolutePath();  
            System.out.println(bool);  
            // if file exists  
            if (bool) {  
                // prints  
                System.out.println(path);  
                System.out.println(bool);
            }  
        } catch (Exception e) {  
            // if any error occurs  
            e.printStackTrace();  
        }  
    }
}
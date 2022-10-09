import java.io.*;   

//CHARACTER AND BYTE STREAM COMPARISION SIMPLE EXAMPLE

public class p5_2{
    public static void main(String[] args) throws IOException{
        //BYTE STREAM
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try {
            sourceStream = new FileInputStream("testFile1.txt");
            targetStream = new FileOutputStream ("file2.txt");
            // Reading source file using read method 
            // and write to file byte by byte using write method
            int temp;
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte)temp);            
        }finally {
            if (sourceStream != null){
                sourceStream.close();   
            }
            if (targetStream != null){           
                targetStream.close(); 
            }
        }



        //CHARACTER STREAM
        FileReader in = null;
        FileWriter out = null;
        // Reading source file using read method 
        // and write to file using write method
        try {
            in = new FileReader("testFile1.txt");
            out = new FileWriter("file2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
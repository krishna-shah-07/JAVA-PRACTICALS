import java.io.*;
import java.util.Scanner;

class Pr7 { 
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Line to search : ");
        String sl = sc.nextLine();
        sc.close();
        int flag = 1, count =1;
        try{
            //in file file1.txt
            String path = "file1.txt";
            BufferedReader br = new BufferedReader(new FileReader(path));
            String line;

            //condition to check if line existes
            while((line = br.readLine()) != null){
                if(sl.equals(line.toString()))
                    System.out.println("In line number : " + count);
                else
                    flag++;
                count++;
            }

            //flag will be equal to count if line doesn't exist
            if(flag >= count){
                System.out.println(-1);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

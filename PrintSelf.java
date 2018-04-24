import java.io.*;

public class PrintSelf{
    public static void main(String[] args) throws Exception {
       File file = new File("PrintSelf.java");
       BufferedReader br = new BufferedReader(new FileReader(file));
       String str;
       while((str=br.readLine())!=null){
           System.out.println(str);
       }
    }
}
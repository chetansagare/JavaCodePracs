import java.io.*;

public class PrintSelfWithFileReader{
    public static void main(String[] args) throws Exception {
        File file = new File("PrintSelfWithFileReader.java");
        FileReader fr = new FileReader(file);
        int i;
        while((i=fr.read())!=-1) System.out.print((char)i);
    }
}
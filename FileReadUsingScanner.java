import java.util.Scanner;
import java.io.*;

public class FileReadUsingScanner{
    public static void main(String[] args) throws Exception {
        File file = new File("FileReadUsingScanner.java");
        Scanner sc = new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.println(sc.next());
        //while(sc.hasNextLine()) System.out.println(sc.nextLine());
    }
}
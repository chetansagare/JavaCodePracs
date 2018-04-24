import java.io.*;
import java.nio.file.*;
public class ReadFileAsString{
    public static void main(String[] args) throws Exception{
        String data = new String(Files.readAllBytes(Paths.get("ReadFileAsString.java")));
        System.out.println(data);
    }
}
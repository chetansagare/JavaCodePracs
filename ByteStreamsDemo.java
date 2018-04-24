import java.io.*;

public class ByteStreamsDemo{
    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int c ;

            while ((c = in.read())!=-1){
                out.write(c);
            }
        } finally {
            //TODO: handle exception
            if(in!=null) in.close();
            if(out!=null) out.close();

        }
            
        }   
    }
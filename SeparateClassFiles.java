import java.io.*;

public class SeparateClassFiles{
public static void main(String args[]){
File dir =new File("/Users/chetansagare/JavaCodes");
FilenameFilter filter = new FilenameFilter(){

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".class");
            }
        };
        String[] files = dir.list(filter);

        boolean state =new File("/Users/chetansagare/JavaCodes/ClassFiles").mkdir();
        //System.out.println(state);

        if(files==null) System.out.println("No Class Files Found!");
        else{
            File classFile ;
        for(int i=0;i<files.length;i++){
            classFile=new File("/Users/chetansagare/JavaCodes/"+files[i]);
            classFile.renameTo(new File("/Users/chetansagare/JavaCodes/ClassFiles/"+files[i]));
        }
        }
        
    }
}

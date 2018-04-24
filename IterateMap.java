import java.util.HashMap;
import java.util.Vector;

public class IterateMap{
    public static void main(String[] args) {
        HashMap<String,Vector<String>> map = new HashMap<>();

        Vector<String> vect = new Vector<>();
        vect.add("Chetan");
        vect.add("loves");
        vect.add("Pragya");
        map.put("Hie", vect);

        Vector<String> vect2 = new Vector<>();
        vect2.add("Pragya");
        vect2.add("is");
        vect2.add("So");
        vect2.add("Lovely");
        vect2.add("&");
        vect2.add("Pretty");
        map.put("Hello", vect2);


        for(String str: map.keySet()){
            for(String val : map.get(str)){
                System.out.print(val+" ");
            }
        }
    }
}
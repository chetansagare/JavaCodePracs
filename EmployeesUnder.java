import java.util.HashMap;
import java.util.ArrayList;

public class EmployeesUnder{
    
    public static void main(String[] args) {
        HashMap<String,String> dataSet=new HashMap<>();
        dataSet.put("A", "C");
        dataSet.put("B", "C");
        dataSet.put("C", "F");
        dataSet.put("D", "E");
        dataSet.put("E", "F");
        dataSet.put("F", "F");
 
        HashMap<String,Integer> res=getResult(dataSet);
        System.out.println("result = " + res);
    }
    static HashMap<String,Integer> getResult(HashMap<String,String> dataSet){
        HashMap<String,ArrayList<String>> result=new HashMap<>();

        for(String s:dataSet.keySet()){
            String mngr=dataSet.get(s);
            if(s!=mngr){
                if(result.containsKey(mngr)){
                    ArrayList<String> emps=result.get(mngr);
                    emps.add(s);
                }else{
                    ArrayList<String> emps=new ArrayList<>();
                    emps.add(s);
                    result.put(mngr, emps);
                }
            } 
        }

        HashMap<String,Integer> res=new HashMap<>();

        for(String m:result.keySet()){
            ArrayList<String> list=result.get(m);
            int num=0;
            num=num+list.size();
            for(int j=0;j<list.size();j++){
                String emp=list.get(j);
                if(result.containsKey(emp)){
                    int temp=result.get(emp).size();
                    num=num+temp;
                }else{
                    res.put(emp, 0);
                }
            }
            if(!res.containsKey(m)){
                res.put(m, num);
            }
        }
        return res;
    }
}
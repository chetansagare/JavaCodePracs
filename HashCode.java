import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashCode{

    static Map<String, Integer> result = new HashMap<>();

    public static void main(String[] args) {
        Map<String,String> data = new HashMap<String,String>();
        data.put("A", "C");
        data.put("B", "C");
        data.put("C", "F");
        data.put("D", "E");
        data.put("E", "F");
        data.put("F", "F");

        getUnderEmps(data);

        System.out.println(result);
    }
    private static void getUnderEmps(Map<String,String> data) {
        Map<String,List<String>> mngrEmpMap = new HashMap<String,List<String>>();
        for(Map.Entry<String,String> entry : data.entrySet()){
            String emp = entry.getKey();
            String mngr = entry.getValue();

            if(!emp.equals(mngr)){
                List<String> directReportist = mngrEmpMap.get(mngr);
                if(directReportist==null)
                    directReportist = new ArrayList<String>();
                    directReportist.add(emp);
                    mngrEmpMap.put(mngr,directReportist);
            }  
        }
        for (String mngr : data.keySet()){
            populateResultUtil(mngr,mngrEmpMap);
        }
    }
    private static int populateResultUtil(String mngr, Map<String,List<String>> mngrEmpMap){
        int count =0;
        if(!mngrEmpMap.containsKey(mngr)){
            result.put(mngr,0);
            return 0;
        }
        else if (result.containsKey(mngr)){
            count=result.get(mngr);
        } else {
            List<String> directReportEmpList = mngrEmpMap.get(mngr);
            count=directReportEmpList.size();
            for (String directReportEmp :  directReportEmpList ) {
                count+=populateResultUtil(directReportEmp, mngrEmpMap);
                result.put(mngr, count);
            }
        }
        return count;
    }
}
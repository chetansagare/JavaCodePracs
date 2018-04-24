public class ExcelColumn{
    public static void main(String[] args) {
        getExcelCol(26);
        getExcelCol(51);
        getExcelCol(52);
        getExcelCol(80);
        getExcelCol(676);
        getExcelCol(702);
        getExcelCol(705);

    }
    public static void getExcelCol(int n) {
        int d =26;
        String excelName = "";

        while (n>0) {
            int rem = n%d;
            if (rem!=0) {
                //System.out.print("test");
                 
                excelName=Character.toString((char)rem) + excelName;
                n=n/d;
            } else {
                excelName='Z'+excelName;
                n=n/d;
                n=n-1;
            }
            
        }
        System.out.println(excelName);
    }
}
public class ReplaceWildCards{
    public static void main(String[] args) {
        String str = "1??0?101";
        char[] array = str.toCharArray();
        print(array,0);
    }
    private static void print(char[] array, int index) {
        if(index==array.length){
            System.out.println(array);
            return;
        }
        if(array[index]=='?'){
            array[index]='0';
            print(array, index+1);

            array[index]='1';
            print(array, index+1);
            
            array[index]='?';
            
        }else{
            print(array, index+1);
        }
    }
}
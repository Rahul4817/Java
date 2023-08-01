import java.util.HashMap;

public class String {

    public static void main(String[] args) {

        String str="ram kumar";
        Hashmap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<=str.length();i++){

            char singleChar=str.charAt(i);
            if(map.get(singleChar)==null){
                map.put(singleChar,1);
            }
            else{
                
                int count=map.get(singleChar);
                map.put(singleChar,count+1);
            }
        }
        System.out.println(map);

    }
    private int length() {
        return 0;
    }
    pair sum / two sum (Lc :1)
    i/p :arr = {2.1,5,6,3,7}, k= 11
     o/p :2,3
     pair is 5 and 6 
     
        
     public static viod main(String[]arges){
        int arr[] = {3,2,5,7,6,9}
        int k = 11;    
}        approch

}
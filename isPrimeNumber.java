import java.util.ArrayList;

public class isPrimeNumber {


    static boolean isArmstrongNumber(int num,int sum,int org){

        if(num==0){
            if(sum==org){
                return true;
            }
            return false;
        }
        int digit=num%10;
        sum=sum+digit*digit*digit;
        num=num/10;
        return false ;



    }

    static ArrayList<Integer> getAllArmstrong(int num,int n,int i){
        
        int digit=num%10;
        digit=digit*digit*digit;

        if(i==n){
            ArrayList<Integer> list=new ArrayList<>();
            return list;
        }
        ArrayList<Integer>list2=getAllArmstrong(n,i+1, digit);
            //Armstrong number check logic
        if(isArmstrongNumber(i,0,i)){
            list2.add(i);
        }
        return list2;

    }

    public static void main(String[] args) {
        int arr[]=new int[10];
        arr[0]=1;
        ArrayList<Integer> i=new ArrayList<>();
        i.add(100);//

        


    
    
        
    
    
}

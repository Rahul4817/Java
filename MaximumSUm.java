public class  MaximumSUm{
    public static void main(String[]args){
        static void  approch_1(int arr[],int k){
            int  Maxsum = 0;
            for(int i = 0; i+k-1<arr.lengh;i++){
                int sum =0;
                for(int j = 0;j<k;j++){
                    sum += arr[i+j];
                }
                if(sum >maxsum){
                    maxsum = sum;
                }
                system.out.println("maxs sum:"+maxsum);{

                }
            }

        }

    }

}
   


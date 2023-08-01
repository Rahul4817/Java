public class WaterTrapping{

    public static void main(String[] args){

        int arr[] =  {0,1,0,2,1,0,1,3,2,1,2,1};
        int n = arr.length;
        int pmax[]= new int[n];
        pmax[0]= arr[0];
        for(int i=1;i<n;i++){
            pmax[i]=Math.max(pmax[i-1], arr[i]);
        }

        int smax[]=new int[n];
        smax[n-1]=arr[n-1];
        for(int i=n-2;i>=n;i--){
            pmax[i]=Math.max(smax[i-1], arr[i]);
        }

        int total=0;
        for(i=1;i)

    }
    

}
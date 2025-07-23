import java.util.*;
public class Subarrays {
    public static void subarrays(int arr[]) {
        for(int i=0; i<arr.length; i++){
            int start= i;
            for(int j=i;j<arr.length; j++){
                int end= j;
                for( int k=start; k<=end; k++){
                    System.out.print("("+arr[k]+")" );
                    // int mxsum= Integer.MIN_VALUE;
                    // int minsum = Integer.MAX_VALUE;
                    // if(arr[k]>mxsum){
                    //     mxsum=arr[k];
                    //     System.out.println("Maximum sum :" +mxsum);
                    // }
                    // if(arr[k]<minsum){
                    //     minsum=arr[k];
                    //     System.out.println("Minimum sum is : "+minsum);
                    // }
                }
            }System.out.println();
           System.out.println(); 
        }
        
    }
    public static void main(String[] args) {
        int arr[]= { 2,4,6,8,10};
        subarrays(arr);

    }
}

import java.util.*;

public class Largestlinear {
    public static int largestnumber(int arr[]){
        int max =   Integer.MIN_VALUE; 
        //int min = Integer.MAX_VALUE;

        for(int i= 0 ; i<arr.length; i++){ 
            if(arr[i]>max){
                max = arr[i]; 
            }

        }
        return max;

}
    public static void main(String[] args) {
        int arr[]= {1,2,6,99,5};
        int ans = largestnumber(arr);
        System.out.println("Largest : "+ans);

    }
    
}

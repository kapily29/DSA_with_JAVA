import java.util.*;
public class Linear {
    public static int linearSearch(int arr[], int key) {
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14,16};
        int key =100;
        // for(int i=0; i<=arr.length-1; i++){
        //     if(arr[i]==key){
        //         System.out.println("The index of array : " +i);
        //     }
        // }
        int ans = linearSearch(arr, key);
        if(ans==0){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+ans);
        }
    }
    
}

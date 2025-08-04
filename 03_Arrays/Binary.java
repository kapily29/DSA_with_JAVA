import java.util.*;

public class Binary {
    public static int binarysearch(int arr1[],int key){
        int start= 0;
        int End = arr1.length-1; 
        while(start<=End){
            int mid = (start + End)/2;
            if(arr1[mid]==key){
                return mid;
            }if(arr1[mid]<key){
                start = mid+1;
            }else{
                End = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int arr1[]={2,4,6,8,10,12};
        int key = 12;
        int ans =binarysearch(arr1, key);
        System.out.println("Element found at index "+ans);

    }
    
}

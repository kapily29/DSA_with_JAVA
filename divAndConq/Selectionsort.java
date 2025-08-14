package Kapil.DSA_with_JAVA.divAndConq;

public class Selectionsort {
    public static void selectSort(int arr[]){
        for(int i = 0 ; i<arr.length-1; i++){
            int minpos =i;
            for(int j =i+1; j<arr.length; j++){
                if(arr[j]<arr[minpos]){
                    minpos=j;
                }
            }
            int temp = arr[minpos];
            arr[minpos]= arr[i];
            arr[i] = temp;
            
        }

    }
    public static void printArray(int arr[]) {
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={5,4,1,2,3};
        selectSort(arr);
        printArray(arr);
        
    }
    
}

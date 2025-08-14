package Kapil.DSA_with_JAVA.divAndConq;

public class Insertion {
    public static void insertSort(int arr[]){
        for(int  i =0 ; i<arr.length; i++){
            int  current = arr[i];
            int prev = i-1;
            while (prev>=0 && arr[prev]> current) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = current;
        }
    }
    public static void printArr(int arr[]) {
        for(int  i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,2,3};
        insertSort(arr);
        printArr(arr);
    }
    
}

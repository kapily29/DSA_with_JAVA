public class FirstOccEle {
    public static int firstrOccerrence(int arr[], int key, int i){
        if(i==arr.length){
            return -1;

        }
        if(arr[i]==key){
            return i;
        }
        return firstrOccerrence(arr, key, i+1);
    }
    public static void main(String[] args) {
        int arr[]= {8,3,4,5,6,7,5,9};
        int key = 5;
        System.out.println(firstrOccerrence(arr, key, 0));
    }
}

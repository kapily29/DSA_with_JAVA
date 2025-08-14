public class SumNatNum {
    public static int naturalsum(int n){
        if(n==1){
            return 1;
        }
        int num1 = naturalsum(n-1);
        int sum = n + num1;
        return sum;

    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(naturalsum(n));
    }
    
}

import java.util.*;
public class Fibonacci {
    public static int SumFib(int n){
        if(n==0 || n==1){
            return n;
        }

        int fib1 = SumFib(n-1);
        int fib2 = SumFib(n-2);

        int fib = fib1+fib2;
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        int ans = SumFib(n);
        System.out.println("The Fibonacci is : "+ans);

        

    }
}
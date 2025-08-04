package Kapil.DSA_with_JAVA.Recursion;
import java.util.*;

public class Factorial {
    public static int factnum(int n){
        if(n==0){
            return 1;  
        }
        int facn = n*factnum(n-1);
        return facn;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(factnum(n));
    }
    
}

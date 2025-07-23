package Kapil.DSAWithJava.Operators;

import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the A value =  ");
         int  a = sc.nextInt();

        System.out.print("Enter the B Value =  ");
        int  b = sc.nextInt();


        boolean grtg = a>b;
        System.out.println( grtg);

        boolean lstg = a<b;
        System.out.println( lstg);

        boolean eqeq = a==b;
        System.out.println( eqeq);

        boolean greq = a>=b;
        System.out.println( greq);

        boolean lseq = a<=b;
        System.out.println(lseq);

        boolean noeq = a!=b;
        System.out.println( noeq);

    
    }
}

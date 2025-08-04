package Kapil.DSAWithJava.Operators;

import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value Of A =  ");
        int a = sc.nextInt();
        System.out.print("Enter the value OF B =  ");
        int b = sc.nextInt();
        
        // Addition
        int Sum = a+b;
        System.out.println("The Addition of A and B =" +Sum);

        //difference
        int diff = a-b;
        System.out.println("The Difference  of A and B =" +diff);

       //Multiplication
        int mul = a*b;
        System.out.println("The Multiplication of A and B =" +mul);

        //Division
        int div = a/b;
        System.out.println("The Division of A and B =" +div);

        //Modulus
        int mod = a%b;
        System.out.println("The Modulus of A and B =" +mod);

    }
}

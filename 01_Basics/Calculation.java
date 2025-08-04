package Kapil.DSAWithJava.Basics;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.print("Enter 1st Number : ");
    a=sc.nextInt();

    int b;
    System.out.print("Enter 2nd NUmber : ");
    b=sc.nextInt();

    //Addition 
    int add = a+b;
    System.out.println("Addition is : "+add);

    //Substraction
    int sub = a-b;
    System.out.println("Substraction is : "+sub);

    //Multiply
    int mul = a*b;
    System.out.println("Multiplication is : "+mul);

    //Division 
    int div = a/b;
    System.out.println("Divsion is : "+div);

    //Division 
    int rdiv = a%b;
    System.out.println("Divsion is : "+rdiv);
    
    }    
}

package Kapil.DSAWithJava.Basics;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        System.out.print("Enter the number : ");
        number = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(number+"*"+i+"="+number*i); 

        }
    }
    
}

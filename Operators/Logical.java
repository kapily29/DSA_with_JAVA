package Kapil.DSAWithJava.Operators;

import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Boolean = ");
        // boolean b1 = sc.nextBoolean();
        // System.out.println("Enter Boolean 2= ");
        // boolean b2 = sc.nextBoolean();

        //And
        boolean tt = true && true;
        System.out.println(tt);

        boolean tf = true && false;
        System.out.println(tf);

        boolean ft = false && true;
        System.out.println(ft);

        boolean ff = false && false;
        System.out.println(ff);

        System.out.println();
        // Or

        boolean ott = true || true;
        System.out.println(ott);

        boolean otf = true || false;
        System.out.println(otf);

        boolean oft = false || true;
        System.out.println(oft);

        boolean off = false || false;
        System.out.println(off);

        System.out.println();
        //Not
        boolean t = ! true;
        System.out.println(t);

        boolean f = ! false;
        System.out.println(f);
    }
    
}

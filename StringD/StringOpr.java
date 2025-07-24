import java.util.*;
public class StringOpr {
    public static void printstr(String str) {
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }


        
    }

    public static void main(String[] args) {
        String name = "Kapil Dahiya";
        String firstName = "Kapil";
        String lastname = "Dahiya";
        String fullName = firstName + " " +lastname;
        System.out.println("The length of String : " +name.length());
        System.out.println(fullName);
        System.out.println(name.charAt(0));
        printstr(lastname);


    }
    
}

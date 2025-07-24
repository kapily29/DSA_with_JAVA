import java.util.*;
public class Palindrome {
    public static boolean optimizedpallindrone(String str){
        int first = 0;
        int last = str.length()-1;

        while(first<=last){
            if(str.charAt(first)!=str.charAt(last)){
                return false;
            }
            first++;
            last--;
        } 
        return true; 
    }
    public static void strpali(String str){
        String str2 = "";
        for( int i = str.length()-1; i>=0; i--){
            str2+=str.charAt(i);
        }
        // System.out.println("String 2 : "+str2);
        if(str.equals(str2)){
            System.out.println("String is Palindrome");
        }
        else{
            System.out.println("String is Not a Palindrome");
        }   
}
    public static void main(String[] args) {
        String str1 = "nogh+on";
        strpali(str1);
        boolean ispalli = optimizedpallindrone(str1);
        if(ispalli){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
    
}

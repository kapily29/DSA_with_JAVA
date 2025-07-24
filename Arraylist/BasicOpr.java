package Kapil.DSAWithJava.Arraylist;

import java.util.ArrayList;
import java.util.*;

public class BasicOpr{
    public static void main(String[] args) {

        //To define an ArrayList : 

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Basic Operation on Arraylist : 

        // ADD Element : 
        list.add(5);
        list.add(3);
        list.add(4);

        System.out.println(list);
        System.out.println("The Size of List :"+list.size());

        // Get Element : 
        list.get(1);
        System.out.println("Element at Index 1 : " +list.get(1));

        // Remove Element : 
        list.remove(2);
        System.out.println("list Afterr removing element  : "+list.remove(2));

        // Set Element At Index : 
        list.set(0, 10);
        System.out.println("list after set element : "+list);

        // Contains Element : 

        System.out.println(list.contains(3));
        System.out.println(list.contains(4));

    }
    
}

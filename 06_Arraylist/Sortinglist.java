package Kapil.DSAWithJava.Arraylist;
import java.util.*;
public class Sortinglist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(13);
        System.out.println("The original list :" +list);

        //after the sorting(asscending order) 
        Collections.sort(list);
        System.out.println("the list in asscending order :" +list);

        //Sorting in descending order: 
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("the list in descending order is : "+list);


    }
    
}

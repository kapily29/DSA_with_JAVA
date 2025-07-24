package Kapil.DSAWithJava.Arraylist;
import java.util.ArrayList;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(13);
        System.out.println("the list before reverse : " +list);

        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i)+" ");
        }
    }

    
}

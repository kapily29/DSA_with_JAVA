package Kapil.DSAWithJava.Arraylist;
import java.util.ArrayList;
public class Swap2Element {
    public static void Swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(1);
        list.set(idx1, list.get(idx2));
        list.set(list.get(idx2), temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(13);
        int idx1 = 1, idx2 = 3;
        System.out.println(list);
        Swap(list, idx1,idx2) ;
        System.out.println(list);



    }
}


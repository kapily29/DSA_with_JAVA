package Kapil.DSAWithJava.Arraylist;
import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(11);
        list.add(13);

        for(int i = 0; i<list.size(); i++){
            if(list.get(i)>max){
                max = list.get(i);
            }
        }
        System.out.println("The Maximum Elemnent  is : "+max);

        
    }
    
}

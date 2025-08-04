package Kapil.DSA_with_JAVA.Arraylist;
import java.util.*;
public class PairSum {
    public static boolean pairsum(ArrayList<Integer>list,int target){
        int ltptr = 0;
        int rtptr = list.size()-1;
        while(ltptr!=rtptr){
            if(list.get(ltptr) + list.get(rtptr)==target){ 
                return true;
            }else if(list.get(ltptr)+list.get(rtptr)>target){
                rtptr--;
            }else{
                ltptr++;
            }

        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =5;
        boolean ans = pairsum(list, target);
        System.out.println(ans);


    }

    
}

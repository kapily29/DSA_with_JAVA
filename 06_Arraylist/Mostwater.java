package Kapil.DSA_with_JAVA.Arraylist;
import java.util.*;
class Mostwater {
    public static int storeWater(ArrayList<Integer>height){
        int maxwater =0;
        int lp =0;
        int rp =height.size()-1;
        while(lp<rp){
            int ht = Math.min(height.get(lp),height.get(rp));
            int width = rp-lp;
            int currwater = ht*width;
            maxwater = Math.max(maxwater, currwater);
            if(height.get(lp)<height.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }
        return maxwater;
    }
    public static void main(String[] args) {
        ArrayList<Integer> height= new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        int water = storeWater(height);
        System.out.println(water);
    }
}
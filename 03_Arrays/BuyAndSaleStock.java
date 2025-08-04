import java.util.*;
public class BuyAndSaleStock {
    public static void buysell(int stock[]){
        int maxsale= Integer.MIN_VALUE;
        int minsale = Integer.MAX_VALUE;
        int n = stock.length;
        for(int i=0; i<n; i++){
            if(stock[i]>maxsale){
                maxsale = stock[i];
            }
        }
        for(int j=0; j<n; j++){
            if(stock[j]<minsale){
                minsale = stock[j];
                
            }
        }
        int profit = maxsale - minsale;
        System.out.println("The profit is :" +profit);
  
}
    public static void buyandsellstock(int arr[]) {
        
    }
    public static void main(String[] args) {
      int stock[]={3,5,2,78,4,6};
        buysale(stock);


    }
    
}

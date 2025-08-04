public class basic {
    public static void count(int i, int n){ //count(4 , 5)
        if(i==n){
            return;
        }
        count(i+1, n);
        System.out.println(i); 
         
        
    }
    public static void main(String[] args) {
        int n=5;
        int i=1;
        count(i, n);  
    }
    
}

import java.util.*;

public class Matrix{
    public static void main(String args[]){
        int maxvalue=Integer.MIN_VALUE;
        int minvalue = Integer.MAX_VALUE; 
        int Matrix[][] = new int[3][3];
        int n=Matrix.length, m= Matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                Matrix[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(maxvalue<Matrix[i][j]){
                    maxvalue=Matrix[i][j];

                }if(minvalue>Matrix[i][j]){
                    minvalue=Matrix[i][j];
                }
                

                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
                System.out.println("Maximum "+maxvalue);
                System.out.println("Minumum "+minvalue);
    }
    
}

import java.util.*;
public class Diagonalsum {
    public static void diaSum(int matrix[][]){
        int pridiaSum= 0;
        int secdiaSum = 0;
        for(int i=0; i<=matrix.length-1; i++){
            for( int j = 0; j<=matrix[0].length-1; j++){
                if(i==j){
                    pridiaSum+=matrix[i][j];

                }if(i+j== matrix.length-1){
                    secdiaSum+=matrix[i][j];
                }
            }

        }
        System.out.println("Diagonal sum : "+(pridiaSum+secdiaSum));
    }
    public static void main(String[] args) {
        int matrix[][] = {
                         {1,2,3},
                         {5,6,7},
                         {9,10,11},
                         
                         };
        diaSum(matrix);
    }
    
}

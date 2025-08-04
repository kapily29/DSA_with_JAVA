import java.util.*;
public class Basics{
    public static void update(int marks[]){
        for( int i=0; i<marks.length; i++){
            marks[i]= marks[i]+1;
        }
    }
    public static void printArr(int marks[]){
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+" ");
        }
    }
    public static void main(String[] args) {
        int marks[]= { 99,94,93};

        update(marks);
        printArr(marks);

    }
}
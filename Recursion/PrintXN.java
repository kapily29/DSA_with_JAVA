import java.util.Scanner;

public class PrintXN {
    public static int printXofN(int x,int n){
        if(n==0){
            return 1;
        }
        int xmn1 = printXofN(x, n-1);
        int xnm = x*xmn1;
        return xnm;

    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int x = sc.nextInt();
        // System.out.println("Enter the value of X :" );
        // int n = sc.nextInt();
        // System.out.println("Enter the value of N :");
        System.out.println("the answer is : " +printXofN(3, 2 ));
    }
    
}

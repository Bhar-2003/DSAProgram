import java.util.Scanner;
public class NumberPOf2Two {
    static boolean powerOf2(int n){
        if(n==0){
            return false;
        }
        return (n&(n-1))==0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(powerOf2(n));
    }
}

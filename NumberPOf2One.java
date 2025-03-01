import java.util.Scanner;
public class NumberPOf2One {
    // Time Complexity :O(log n)
    static boolean powOf2(int n){
        if( (n & (n-1)) == 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(powOf2(n));
    }
}

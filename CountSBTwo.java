import jdk.jshell.SourceCodeAnalysis;
import java.util.Scanner;
public class CountSBTwo {
    // Time Complexity :O(log n)
    static int countSetBits(int n){
        int count=0;
        while (n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(countSetBits(n));
    }
}

import java.util.Scanner;
public class ReverseBitsOfIntegers {
    // Time Complexity :O(log n)
    static int reverseOfBits(int n){
        int f=31,l=0;
        int reverse=0;
        while(f>l){
            if((n&(1<<f))!=0){
                reverse=reverse|(1<<l);
            }
            if ((n&(1<<l))!=0){
                reverse=reverse|(1<<f);
            }
            f--;
            l++;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(reverseOfBits(n));
    }
}

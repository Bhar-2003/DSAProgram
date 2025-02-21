import java.util.Scanner;
public class PrimeNumberTwo {
    // -> Time Complexity : O(sqrt(n))
    static boolean isPrime(int num){
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println(isPrime(num));
    }
}

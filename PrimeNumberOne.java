import java.util.Scanner;
public class PrimeNumberOne {
    // Time Complexity : O(n)
    static boolean isPrime(int num){
        for(int i=2;i<num/2;i++){
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

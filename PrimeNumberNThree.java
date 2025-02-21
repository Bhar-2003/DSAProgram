import java.util.Scanner;
public class PrimeNumberNThree {
    // Leonhard Euler proved :
    // Time Complexity : O(sqrt(n log(log(n))))
    static void sievePrintPrime(int num){
        boolean[] prime=new boolean[num+1];
        for(int i=2;i<=num;i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= num; j = j + i) { // changes in j=i*i
                    prime[j] = true;
                }
            }
        }
        for (int i=2;i<=num;i++) {
            if (prime[i] == false) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        sievePrintPrime(num);
    }
}
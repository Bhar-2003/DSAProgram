import java.util.Scanner;
public class PrimeNumberNOne {
    // Time Complexity : O(n)
    // Doubt
    static boolean checkPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        else if(num==2 || num==3) {
            return false;
        }
        else if(num%2==0 ||num%3==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
    static void printPrimes(int num){
        for (int i=2;i<=num;i++){
            if(checkPrime(i)){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        printPrimes(num);
    }
}

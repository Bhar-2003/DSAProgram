import java.util.Scanner;
public class PrimeNumberThree {
    // Time Complexity : O(sqrt(n))
    static boolean checkPrime(int num){
        if(num==0 || num==1){
            return false;
        }
        if(num==2 || num==3) {
            return false;
        }
        if(num%2==0 ||num%3==0){
            return false;
        }
        for(int i=5;i*i<=num;i+=6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(checkPrime(num));
    }
}

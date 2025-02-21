import java.util.Scanner;
public class PrimeFactorsFour {
    // Time Complexity : O(sqrt(n))
    static void printDivisors(int num){
        int i;
        for(i=1;i*i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
        for (;i>=1;i--){
            if(num%i==0 &&  (i!=num/i)){
                System.out.println(num/i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        printDivisors(num);
    }
}

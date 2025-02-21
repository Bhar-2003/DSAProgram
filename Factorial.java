import java.util.Scanner;
public class Factorial {
    static int factorial(int n){
        int fact=1; // 0! is 1
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }
}

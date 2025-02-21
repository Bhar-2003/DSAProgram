import java.util.Scanner;
public class PrintFactorsThree {
    // Time Complexity : O(sqrt(n))
    static void printDivisors(int num){
        for(int i=1;i*i<=num;i++){
            {
                if(num%i==0) {
                    System.out.println(i);
                }
                if(num/i==i) {
                    System.out.println(num / i);
                }
            }
        }
    }
    // It will print in Order two times 5 if input is 25
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        printDivisors(num);
    }
}

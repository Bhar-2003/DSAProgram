import java.util.Scanner;
public class PrintFactorsOne {
    // Time Complexity : O(n)
    static void printFactors(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        printFactors(num);
    }
}

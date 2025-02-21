import java.util.Scanner;
public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num = sc.nextInt();
        int sum=num*(num+1)/2;
        System.out.println(sum+" is the Sum of N Natural Numbers of "+num);
    }
}

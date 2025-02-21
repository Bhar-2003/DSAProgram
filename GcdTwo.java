import java.util.Scanner;
public class GcdTwo {
    // Time Complexity : O(max(a,b))
    static int euclidGcd(int num1,int num2){
        while (num1!=num2){
            if(num1>num2){
                num1=num1-num2;
            }
            else {
                num2=num2-num1;
            }
        }
        return num1; // you can also return num2
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2 :");
        int num2= sc.nextInt();
        System.out.println(euclidGcd(num1,num2));
    }
}

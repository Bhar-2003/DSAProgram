import java.util.Scanner;
public class GcdThree {
    // Time Complexity : O(log(min(a,b)))
    static int optimizedEuclidGcd(int num1,int num2){
        while(num1!=0 && num2!=0) {
            if (num1 > num2) {
                num1 = num1 % num2;
            } else {
                num2 = num2 % num1;
            }
        }
            if(num1!=0){
                return num1;
            }
            else
            {
                return num2;
            }
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 :");
        int num1=sc.nextInt();
        System.out.println("Enter Number 2 :");
        int num2=sc.nextInt();
        System.out.println(optimizedEuclidGcd(num1,num2));
    }
}

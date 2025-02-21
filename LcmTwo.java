import java.util.Scanner;
public class LcmTwo {
    // -> LCM(a,b)*GCD(a,b) = a * b
    // -> LCM(a,b) = a * b / GCD(a,b)
    // Time Complexity : log(min(num1,num2))

    static int euclidGcd(int num1,int num2) {
        while (num1 != num2) {
            if (num1 > num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }
        }
        return num1; // you can also return num2
    }
        static int lcm(int num1,int num2){
        return (num1*num2)/euclidGcd(num1,num2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(lcm(num1,num2));
    }
}

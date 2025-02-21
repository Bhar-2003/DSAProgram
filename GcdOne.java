import java.util.Scanner;
public class GcdOne {
    // -> Given Two Numbers, Calculate the Greatest Common Divisor (GCD)
    //    or Highest Common Factor (HCF)
    static int gcd(int num1,int num2){
        int min;
        if(num1<num2){
            min=num1;
        }
        else {
            min=num2;
        }
        for (int i=min;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(gcd(num1,num2));
    }
}

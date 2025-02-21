import java.util.Scanner;
public class LcmOne {
    // Time Complexity : O(num1*num2-max(num1,num2))
    static int lcm(int num1,int num2){
        int result=Math.max(num1,num2);
        while (true){
            if(result%num1==0 && result%num2==0){
                break;
            }
            result++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(lcm(num1,num2));
    }
}

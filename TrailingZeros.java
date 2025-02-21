import java.util.Scanner;
public class TrailingZeros {
    static int trailingZeros(int num){
        int result=0;
        int powOf5=5;
        while(num>=powOf5){
            result=result+(num/powOf5);
            powOf5*=5;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int num=sc.nextInt();
        System.out.println(trailingZeros(num));
    }
}

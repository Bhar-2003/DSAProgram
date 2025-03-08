import java.util.Scanner;
public class Consecutive1sOne {
    static boolean checkConsecutive(int n){
        if((n&(n<<1))!=0){
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(checkConsecutive(n));
    }
}

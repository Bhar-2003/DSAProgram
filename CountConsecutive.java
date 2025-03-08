import java.util.Scanner;
public class CountConsecutive {
    static int countConsecutive1s(int n){
        int count=0;
        while (n>0){
            n=n&(n<<1);
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(countConsecutive1s(n));
    }
}

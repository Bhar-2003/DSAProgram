import java.util.Scanner;
public class RightMSBOne {
    // Time Complexity :O(n)
    static int posOfRightMSB(int n){
       int count=0;
       while(n>0){
           count++;
           int rem=n%2;
           if(rem==1)
               break;
           n=n/2;
       }
       return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(posOfRightMSB(n));
    }
}

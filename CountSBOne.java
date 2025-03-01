import java.util.Scanner;
public class CountSBOne {
    // Time Complexity :O(n)
    static int countSBO(int n){
        int count=0;
        while(n>0){
            if(n%2==1)
                count++;
            n=n/2;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(countSBO(n));
    }
}

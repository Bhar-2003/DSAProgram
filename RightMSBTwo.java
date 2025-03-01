import java.util.Scanner;
public class RightMSBTwo {
    // Time Complexity :O(log(N))
    static int posOfRMSB(int n){
        int mask=1;
        int pos=0;
        if(n==0){
            return -1;
        }
        while ((n&mask)==0){
            mask=(mask<<1);
            pos++;
        }
        return pos+1;// this one is to change from index to length

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n=sc.nextInt();
        System.out.println(posOfRMSB(n));
    }
}

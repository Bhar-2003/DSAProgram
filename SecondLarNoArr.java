import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Scanner;

public class SecondLarNoArr {
    static int secondLargestNumber(int arr[]){
        int max1,max2=0;
        if(arr[0]>arr[1]){
            max1=arr[0];
            max2=arr[1];
        }
        else {
            max1=arr[1];
            max2=arr[0];
        }
        for (int i=2;i<=arr.length-1;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }
        }
        return max2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array :");
        for (int ar : arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println(secondLargestNumber(arr));
    }
}

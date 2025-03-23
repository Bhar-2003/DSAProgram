import java.util.Scanner;
public class ReverseArr {
    static int[] reverseArr(int arr[],int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array Size :");
        int size=sc.nextInt();
        System.out.println("Enter the Array Elements :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++)
            arr[i]=sc.nextInt();
        System.out.println("Original Array :");
        for (int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Reversed Array :");
        for (int ar:(reverseArr(arr,0,arr.length-1)))
            System.out.print(ar+" ");
        System.out.println();
    }
}

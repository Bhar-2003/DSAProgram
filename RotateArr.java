import java.util.Scanner;

public class RotateArr {
    static void reverseArr(int arr[],int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    static int[] rotateArr(int[] arr,int k){
        k=k%arr.length;
        if (k<0){
            k+=arr.length;
        }
        reverseArr(arr,0,k-1);
        reverseArr(arr,k,arr.length-1);
        reverseArr(arr,0, arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter how many times to rotate :");
        int rotate=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();
        System.out.println("Original Array :");
        for (int i :arr)
            System.out.print(i+" ");
        System.out.println();
        rotateArr(arr,rotate);
        System.out.println("Rotated Array :");
        for (int i :arr)
            System.out.print(i+" ");
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch {
    // Time Complexity : O(log n)
    static int binarySearch(int arr[],int key){
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while (low<=high){
            mid=(low+high)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if (key<arr[mid]){
                high=mid-1;
                low=low;
            }
            else {
                low=mid+1;
                high=high;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Array Elements :");
        int arr[]=new int[size];
        System.out.println("Enter the Key :");
        int key= sc.nextInt();
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for (int ar :arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println("Sorted Array :");
        Arrays.sort(arr);
        for (int ar :arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println(binarySearch(arr,key));
    }
}

import java.util.Arrays;
import java.util.Scanner;
public class FloorOfArr {
        static int binarySearchForFloor(int arr[],int key) {
            int low = 0,high = arr.length - 1,mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (arr[mid] == key) {
                    return arr[mid];
                } else if (key<arr[mid])
                    high=mid-1;
                else
                    low=mid+1;
            }
            if (high > 0)
                return arr[high];
            else
                return -1;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the size of Array :");
            int size=sc.nextInt();
            System.out.println("Enter the Array Elements :");
            int arr[]=new int[size];
            for(int i=0;i<=arr.length-1;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Enter the Key :");
            int key= sc.nextInt();
            System.out.println("Array :");
            Arrays.sort(arr);
            for (int ar :arr){
                System.out.print(ar+" ");
            }
            System.out.println();
            System.out.println(binarySearchForFloor(arr,key));
        }
    }


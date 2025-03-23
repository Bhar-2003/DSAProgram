import java.util.Scanner;
public class BitonicNumber {
    // Time Complexity O(log n)
    static int binarySearchAscending(int arr[], int key, int range) {
        int low = 0, high = range, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int binarySearchDescending(int arr[], int key, int range) {
        int low = range, high = arr.length - 1, mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            else if (key < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }

    static int findBitonicNumber(int arr[]) {
        int left = 0, mid, right = arr.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1])
                return mid;
            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1])
                left = mid;
            else
                right = mid;
        }
        return -1;
    }

    static int search(int arr[], int key, int bIndex) {
        if (key == arr[bIndex])
            return bIndex;
        if (key > arr[bIndex])
            return -1;
        int result1 = binarySearchAscending(arr, key, bIndex - 1);
        if (result1 != -1)
            return result1;
        int result2 = binarySearchDescending(arr, key, bIndex + 1);
        if (result2 != -1)
            return result2;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size Of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array :");
        for (int ar : arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        System.out.println("Enter the key :");
        int key=sc.nextInt();
        int bIndex=findBitonicNumber(arr);
        System.out.println(search(arr,key,bIndex));
    }
}
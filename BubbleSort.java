import java.util.Scanner;
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original Array :");
        for (int ar : arr){
            System.out.print(ar+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Bubble Sort :");
        for (int ar : arr){
            System.out.print(ar+" ");
        }

    }
}

import java.util.Scanner;
public class SpanOfArr {
    static int spanOfArray(int arr[]) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array size :");
        int size = sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int[] ar = new int[size];
        for (int i = 0; i <=ar.length-1; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Array :");
        for (int arr :ar){
            System.out.print(arr+" ");
        }
        System.out.println();
        System.out.println(spanOfArray(ar));


    }
}

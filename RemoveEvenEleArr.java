import java.util.Scanner;
public class RemoveEvenEleArr {
    public static int[] removeEvenElementArr(int arr[]) {
        int oddCount = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0)
                oddCount++;
        }
        int[] result = new int[oddCount];
        int index = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] % 2 != 0) {
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++)
            arr[i]=sc.nextInt();
        for (int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        for (int i : removeEvenElementArr(arr)) {
            System.out.print(i+" ");
        }


    }
}

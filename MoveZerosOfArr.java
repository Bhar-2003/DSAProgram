import java.util.Scanner;
public class MoveZerosOfArr {
    public static int[] moveZerosOfArr(int arr[]){
        int pointer=0;
        for (int i=0;i<=arr.length-1;i++){
            if(arr[i]!=0 && arr[pointer]==0){
                int temp=arr[i];
                arr[i]=arr[pointer];
                arr[pointer]=temp;
            }
            if (arr[pointer]!=0)
                pointer++;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++)
            arr[i]=sc.nextInt();
        System.out.println("Original Array :");
        for (int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Operated Array :");
        for (int i : moveZerosOfArr(arr))
            System.out.print(i+" ");
    }
}

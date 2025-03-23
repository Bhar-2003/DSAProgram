import java.util.Scanner;
public class ResizeArr {
    //doubt
    public static int[] resizeArr(int arr[],int Size){
        int[]temp=new int[Size];
        for (int i=0;i<=arr.length-1;i++)
            temp[i]=arr[i];
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array :");
        int size=sc.nextInt();
        System.out.println("Enter the Elements of Array :");
        int arr[]=new int[size];
        for (int i=0;i<=arr.length-1;i++)
            arr[i]=sc.nextInt();
        System.out.println("Original Array :");
        for (int i=0;i<=arr.length-1;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Resized Array :");
        for (int ar :arr)
            System.out.println(ar+" ");
        System.out.println(resizeArr(arr,size*2));
        System.out.println("Array Length :");
        System.out.println(arr.length);

    }
}

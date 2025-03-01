import java.util.Arrays;
public class LonelyIntegerOne {
    // Time Complexity :O(n log n)
    static int lonely(int [] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length-2;i+=2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int ar[]={1,6,9,2,6,1,8,9,2};
        System.out.println(lonely(ar));
    }
}

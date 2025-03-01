import java.util.HashSet;

public class LonelyIntegerTwo {
    // Time Complexity : O(n)
    // SET : A set is a DataStructure that can only store unique elements
    static int loneInteger(int []arr){
        HashSet<Integer> s =new HashSet<Integer> ();
        for(int  i :arr){
            if(s.contains(i)){
                s.remove(i);
            }
            else
            {
                s.add(i);
            }
        }
        for(int array:s){
            return array;
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={1,8,6,3,6,3,8,1,4};
        System.out.println(loneInteger(arr));
    }
}

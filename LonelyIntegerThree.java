public class LonelyIntegerThree {
    static int lonelyInteger(int [] arr) {
        int result=0;
        for(int i :arr){
            return result ^ i;
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,3,2,};
        System.out.println(lonelyInteger(arr));
    }
}

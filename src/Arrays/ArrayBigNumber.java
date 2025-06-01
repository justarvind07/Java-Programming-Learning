package Arrays;

public class ArrayBigNumber {
    public static void main(String[] args) {
        int[] arr = {5, 8, 6, 3, 10, 78, 7, 45};
        int find = 10;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == find) {
                ans = i;
                System.out.println("Found " + find + " at index " + ans);
                break;
            }
        } System.out.println(ans);


        /* int ans = 0;
        for (int i = 0; i< arr.length;i++){
            if (arr[i]>ans){
                ans = arr[i];
                break;
            }
        }
        System.out.println(ans);*/
    }
}

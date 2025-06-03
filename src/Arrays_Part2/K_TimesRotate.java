package Arrays_Part2;

public class K_TimesRotate {
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void kTimeRotate(int[] arr, int k) {
        int ans = arr.length;
        k = k % ans;
        if (k == 0)
            return;
        reverse(arr, 0, ans - 1);//Reverse the entire array
        reverse(arr, 0, k - 1);// Reverse first k elements
        reverse(arr, k, ans - 1);//Reverse remaining elements
    }
            /*Reversing array*/
    static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 8, 9};
        int k = 4;
        kTimeRotate(arr, k);
        printArray(arr);
    }
}

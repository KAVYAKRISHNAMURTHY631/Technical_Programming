package DREAM.DSA.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverseUsingLoop(arr);
    }

    static void reverseUsingLoop(int[] arr) {
        int i = 0, j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

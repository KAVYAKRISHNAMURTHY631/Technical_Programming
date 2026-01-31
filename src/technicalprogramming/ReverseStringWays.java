package technicalprogramming;

public class ReverseStringWays {

    public static void main(String[] args) {
        String str = "hello";

        way1_loop(str);
        way2_stringBuilder(str);
        way3_recursion(str);
        way4_charArray(str);
    }

    static void way1_loop(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Way 1: " + rev);
    }

    static void way2_stringBuilder(String str) {
        System.out.println("Way 2: " + new StringBuilder(str).reverse());
    }

    static void way3_recursion(String str) {
        System.out.println("Way 3: " + reverse(str));
    }

    static String reverse(String str) {
        if (str.length() == 1)
            return str;
        return reverse(str.substring(1)) + str.charAt(0);
    }

    static void way4_charArray(String str) {
        char[] arr = str.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println("Way 4: " + new String(arr));
    }
}

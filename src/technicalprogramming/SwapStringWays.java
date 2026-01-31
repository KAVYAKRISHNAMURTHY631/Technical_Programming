package technicalprogramming;

public class SwapStringWays {

    public static void main(String[] args) {
        String str = "abc";

        way1_temp(str);
        way2_charArray(str);
        way3_substring(str);
        way4_xor(str);
        way5_stringBuilder(str);
    }

    static void way1_temp(String str) {
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);

        char temp = a;
        a = c;
        c = temp;

        System.out.println("Way 1: " + a + b + c);
    }

    static void way2_charArray(String str) {
        char[] arr = str.toCharArray();

        char temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        System.out.println("Way 2: " + new String(arr));
    }

    static void way3_substring(String str) {
        String swapped = str.substring(2, 3)
                + str.substring(1, 2)
                + str.substring(0, 1);

        System.out.println("Way 3: " + swapped);
    }

    static void way4_xor(String str) {
        char a = str.charAt(0);
        char c = str.charAt(2);

        a = (char) (a ^ c);
        c = (char) (a ^ c);
        a = (char) (a ^ c);

        System.out.println("Way 4: " + a + str.charAt(1) + c);
    }

    static void way5_stringBuilder(String str) {
        StringBuilder sb = new StringBuilder(str);

        char temp = sb.charAt(0);
        sb.setCharAt(0, sb.charAt(2));
        sb.setCharAt(2, temp);

        System.out.println("Way 5: " + sb);
    }
}

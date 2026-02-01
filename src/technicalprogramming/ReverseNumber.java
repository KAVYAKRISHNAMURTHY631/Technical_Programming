package technicalprogramming;

public class ReverseNumber{

    public static void main(String[] args) {
        int num = 12345;

        way1_usingWhile(num);
        way2_usingFor(num);
        way3_usingString(num);
        way4_usingRecursion(num);
        way5_usingMath(num);
        way6_usingStringBuilder(num);
        way7_usingArray(num);
        way8_usingLogics(num);
    }

    // Way 1: Using while loop
    static void way1_usingWhile(int num) {
        int rev = 0;
        int temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Way 1 (While): " + rev);
    }

    // Way 2: Using for loop
    static void way2_usingFor(int num) {
        int rev = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            rev = rev * 10 + temp % 10;
        }
        System.out.println("Way 2 (For): " + rev);
    }

    // Way 3: Convert number to String
    static void way3_usingString(int num) {
        String str = Integer.toString(num);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Way 3 (String): " + rev);
    }

    // Way 4: Using recursion
    static void way4_usingRecursion(int num) {
        System.out.print("Way 4 (Recursion): ");
        reverseRec(num);
        System.out.println();
    }

    static void reverseRec(int num) {
        if (num == 0)
            return;
        System.out.print(num % 10);
        reverseRec(num / 10);
    }

    // Way 5: Using mathematical approach
    static void way5_usingMath(int num) {
        int rev = 0;
        int n = num;
        int digits = (int) Math.log10(n) + 1;

        while (n != 0) {
            rev += (n % 10) * Math.pow(10, digits - 1);
            n /= 10;
            digits--;
        }
        System.out.println("Way 5 (Math): " + rev);
    }

    // Way 6: Using StringBuilder
    static void way6_usingStringBuilder(int num) {
        StringBuilder sb = new StringBuilder(String.valueOf(num));
        System.out.println("Way 6 (StringBuilder): " + sb.reverse());
    }

    // Way 7: Using char array
    static void way7_usingArray(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++; j--;
        }
        System.out.println("Way 7 (Char Array): " + new String(arr));
    }

    // Way 8: Using modulo logic with String
    static void way8_usingLogics(int num) {
        int temp = num;
        String rev = "";
        while (temp != 0) {
            rev += temp % 10;
            temp /= 10;
        }
        System.out.println("Way 8 (Logic + String): " + rev);
    }
}
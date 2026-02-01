package technicalprogramming;

public class Palindromenumber {

    public static void main(String[] args) {
        int num1 = 121;
        int num2 = 123;

        System.out.println("Checking number: " + num1);
        way1_usingWhile(num1);
        way2_usingFor(num1);
        way3_usingString(num1);
        way4_usingRecursion(num1);
        way5_usingSwapLogic(num1);

        System.out.println("\nChecking number: " + num2);
        way1_usingWhile(num2);
        way2_usingFor(num2);
        way3_usingString(num2);
        way4_usingRecursion(num2);
        way5_usingSwapLogic(num2);
    }

    // Way 1: Using while loop
    static void way1_usingWhile(int num) {
        int rev = 0, temp = num;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println("Way 1 (While): " + (num == rev ? "Palindrome" : "Not Palindrome"));
    }

    // Way 2: Using for loop
    static void way2_usingFor(int num) {
        int rev = 0;
        for (int temp = num; temp != 0; temp /= 10) {
            rev = rev * 10 + temp % 10;
        }
        System.out.println("Way 2 (For): " + (num == rev ? "Palindrome" : "Not Palindrome"));
    }

    // Way 3: Using String
    static void way3_usingString(int num) {
        String str = String.valueOf(num);
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Way 3 (String): " +
                (str.equals(rev) ? "Palindrome" : "Not Palindrome"));
    }

    // Way 4: Using recursion
    static void way4_usingRecursion(int num) {
        int rev = reverseRec(num, 0);
        System.out.println("Way 4 (Recursion): " +
                (num == rev ? "Palindrome" : "Not Palindrome"));
    }

    static int reverseRec(int num, int rev) {
        if (num == 0)
            return rev;
        return reverseRec(num / 10, rev * 10 + num % 10);
    }

    // Way 5: Using swap logic (two pointers)
    static void way5_usingSwapLogic(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            // swapping using temp variable
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        String rev = new String(arr);
        System.out.println("Way 5 (Swap Variables): " +
                (String.valueOf(num).equals(rev) ? "Palindrome" : "Not Palindrome"));
    }
}

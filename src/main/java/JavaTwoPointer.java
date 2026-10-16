public class JavaTwoPointer {
    public static boolean isPalindrome(String teststring) {
        if (teststring == null) {
            return false;
        }

        int left = 0;
        int right = teststring.length() - 1;

        char leftchar = Character.toLowerCase(teststring.charAt(left));
        char rightchar = Character.toLowerCase(teststring.charAt(right));

        if (leftchar != rightchar) {
            return false;
        }

        left++;
        right--;

        return true;
    }

    public static void main(String[] args) {
        String test1 = "racecar";
        String test2 = "pants";

        System.out.println("Test string: " + test1 + " || Is it a palindrome? RESULT: " + isPalindrome(test1));
        System.out.println("Test string: " + test2 + " || Is it a palindrome? RESULT: " + isPalindrome(test2));

    }
}

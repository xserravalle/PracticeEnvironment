public class JavaBinaryPalindrome {
    public static int minSwapsToPalindrome(String s) {
        if (s == null || s.length() <= 1) {
            return 0;
        }

        int zeros = 0;
        int ones = 0;
        for (char c : s.toCharArray()) {
            if (c == '0') zeros++;
            else if (c == '1') ones++;
        }

        int oddCount = (zeros % 2 != 0 ? 1 : 0) + (ones % 2 != 0 ? 1 : 0);
        if (oddCount > 1) {
            return -1;
        }


        char[] chars = s.toCharArray();
        int swaps = 0;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] == chars[right]) {
                left++;
                right--;
            } else {
                int k = right - 1;
                while (k > left && chars[k] != chars[left]) {
                    k--;
                }

                if (k == left) {
                    char temp = chars[left];
                    chars[left] = chars[left+1];
                    chars[left + 1] = temp;
                    swaps++;
                } else {
                    for (int j = k; j < right;j++) {
                        char temp = chars[j];
                        chars[j] = chars[j+1];
                        chars[j+1] = temp;
                        swaps++;
                    }
                    left++;
                    right--;
                }
            }
        }
        return swaps;
    }

    public static void main(String[] args) {
        String test1 = "01010011";
        System.out.println("Swaps for " + test1 + ": " + minSwapsToPalindrome(test1));

        String test2 = "1100";
        System.out.println("Swaps for " + test2 + ": " + minSwapsToPalindrome(test2));

        String test3 = "010";
        System.out.println("Swaps for " + test3 + ": " + minSwapsToPalindrome(test3));

        String test4 = "0001";
        System.out.println("Swaps for " + test4 + ": " + minSwapsToPalindrome(test4));
    }
}

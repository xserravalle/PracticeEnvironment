public class ReverseString {
    public static String reverseRecursive(String str) {
        if (str == null || str.length() <= 1) {
            return str;
        }

        return str.charAt(str.length() - 1) + reverseRecursive(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) {
        String apple = "apple";

        System.out.println("Contents of apple: " + apple);

        System.out.println("NEW contents of apple after reversing using reverseRecursive:");
        System.out.println(reverseRecursive(apple));
    }
}

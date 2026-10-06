public class JavaStringMethods {
    // FUNCTION isPalindrome TO CHECK TO SEE IF THE STRING IS A PALINDROME
    public static boolean isPalindrome(String str) {
        // GUARD CASE -- IF THE STRING PASSED IS EMPTY OR OF NULL VALUE, THE BOOLEAN VALUE RETURNED IS FALSE
        if (str == null) return false;

        // NEXT, SET AN INTEGER VALUE TO THE LENGTH OF THE STRING
        int len = str.length();

        // USE A COUNT CONTROLLED FOR LOOP TO TRAVERSE FROM THE LEFT SIDE OF THE STRING, WEIGHING THE CHARACTER
        // VALUE AT THAT INDEX AGAINST THE RIGHT SIDE OF THE STRING AT THE INDEX TO COMPARE TO CHECK THAT IT IS
        // THE SAME. IF IT IS NOT THE SAME, IT RETURNS A BOOLEAN VALUE OF false, REFLECTING THAT IT IS NOT A
        // PALINDROME. IF IT IS THE SAME, IT RETURNS A BOOLEAN VALUE OF true, REFLECTING THAT IT IS A PALINDROME.
        for (int i = 0; i < len/2; i++) {
            if (str.charAt(i) != str.charAt(len - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        // INSTANTIATE practiceString AND ASSIGN VALUE kittycat
        String practiceString = "kittycat";
        System.out.println("Practicing .charAt functionality");
        System.out.println("String practiceString instantiated to value: " + practiceString);

        // COUNT CONTROLLED FOR LOOP TO ITERATE THE STRING AS IF IT WERE AN ARRAY
        // PRINT EACH CHARACTER IN THE STRING INDIVIDUALLY
        System.out.println("Iterate through the string with a count-controlled for loop to");
        System.out.println("print each individual character in the string");
        for (int i = 0; i < practiceString.length(); i++){
            char c = practiceString.charAt(i);
            System.out.println(c);
        }

        // USING THE isPalindrome FUNCTION, PASS practiceString TO EVALUATE WHETHER IT IS A PALINDROME
        System.out.println("Evaluating whether the string is a palindrome using isPalindrome function:");
        System.out.println("Is practiceString " + practiceString + " a palindrome?");
        if (!isPalindrome(practiceString)) {
            System.out.println("String " + practiceString + " is NOT A PALINDROME");
         } else {
            System.out.println("String " + practiceString + " IS A PALINDROME!");
        }

        // INSTANTIATING practiceString2 WITH KNOWN PALINDROME racecar TO TEST HAPPY CASE
        String practiceString2 = "racecar";
        System.out.println("Instantiated String practiceString2 with value RACECAR to test happy case");

        if (!isPalindrome(practiceString2)) {
            System.out.println("String " + practiceString2 + " is NOT A PALINDROME");
        } else {
            System.out.println("String " + practiceString2 + " IS A PALINDROME!");
        }
    }
}

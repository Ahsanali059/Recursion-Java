public class PalindromeChecker {
    public static void main(String[] args) {
        int number = 122222;

        if (isPalindrome(number)) {
            System.out.println("Yes, Palindrome number");
        } else
        {
            System.out.println("Not a palindrome number");
        }
    }

    public static boolean isPalindrome(int number) {
        int reverseNumber = reverseInteger(number);
        return number == reverseNumber;
    }

    private static int reverseInteger(int number) {
        return reverseHelper(number, 0);
    }

    private static int reverseHelper(int remaining, int reversed) {
        // base case
        if (remaining == 0)
        {
            return reversed;
        }

        // Recursive call
        int lastDigit = remaining % 10;
        return reverseHelper(remaining / 10, reversed * 10 + lastDigit);
    }
}

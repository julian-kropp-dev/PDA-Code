package PalindromeCheck;

public class IsPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("HelloWorld"));
        System.out.println(isPalindrome("otto"));
    }

    public static boolean isPalindrome(String string) {
        //basis fall
        if (string.length() == 0 || string.length() == 1) {
            return true;
        }

        if (string.charAt(0) == string.charAt(string.length() - 1)) {
            return isPalindrome(string.substring(1, string.length() - 1));
        }
        return false;
    }
}

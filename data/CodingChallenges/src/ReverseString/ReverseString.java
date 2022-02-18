package ReverseString;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseString("HalloWelt"));

    }
    public static String reverseString(String string) {
        if (string.equals("")) {
            return "";
        }

        return reverseString(string.substring(1)) + string.charAt(0);
    }
}

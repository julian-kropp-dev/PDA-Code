package uebung5;

public class MethodsC {
    // testing my method "isLatinLetter" with letter 'd'
    public static void main(String[] args) {
        System.out.println(isLatinLetter('d'));
    }
    public static boolean isLatinLetter(char letter){
        //if input letter is a capital or small letter the method returns a true, otherwise false
        if ((int) letter >= 97 && (int) letter <= 122){
            return true;
        }
        return (int) letter >= 65 && (int) letter <= 90;
    }
}


package uebung6;

public class SymmetricDigitSequence {
    public static void main(String[] args) {
        System.out.println(symmetricDigitSequence(5));
        System.out.println(symmetricDigitSequenceRec(5));
    }

    public static String symmetricDigitSequence(int max) {
        StringBuilder forward = new StringBuilder();
        StringBuilder backward = new StringBuilder();
        for (int i = max; i > 0; i--) forward.append(i);
        for (int i = 0; i < max + 1; i++) backward.append(i);
        return forward.toString() + backward;
    }

    public static String symmetricDigitSequenceRec(int max) {
        if (max > 0) return max + symmetricDigitSequenceRec(max - 1)+ max;
        return "0";

    }
}


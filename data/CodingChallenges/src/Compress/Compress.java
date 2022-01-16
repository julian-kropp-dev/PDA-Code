package Compress;

import java.util.Arrays;

public class Compress {
    public static void main(String[] args) {
        char[] testArray0 = new char[] {};
        char[] testArray1 = new char[] {'A'};
        char[] testArray2 = new char[] {'A', 'A', 'A', 'B', 'C', 'C', 'C'};
        System.out.println(compress(testArray0));
        System.out.println(compress(testArray1));
        System.out.println(compress(testArray2));
    }
    public static int compress(char[] chars) {return chars[0];}

}

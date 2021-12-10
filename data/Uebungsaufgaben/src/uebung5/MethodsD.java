package uebung5;

import java.util.Arrays;

public class MethodsD {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(createIdentityMatrix(2)));
    }
    public static int[][]  createIdentityMatrix( int size ) {
        int[][] identity = new int[size][size];
        for ( int row = 0; row < size; row++ ) {
            for ( int col = 0; col < size; col++ ) {
                if ( row == col )	identity[row][col] = 1;
                else				identity[row][col] = 0;
            }
        }
        return identity;
    }

}

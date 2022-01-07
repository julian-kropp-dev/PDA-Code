package uebung05;

public class Matrizenmultiplikation{
    public static void main(String[] args) {
        int[][] a = new int[][] {{2, 1, 7}, {3, 0, 3}};  //1;2   zx
        int[][] b = new int[][] {{4, 2}, {7, 1}, {5, 2}};    //2;1   xy

        int arrayASpalte = a.length;
        int arrayBZeile = 0;
        int arrayAZeile = 0;

        for (int[] array3: b ) {
            for (int wert1: array3 ) {
                arrayBZeile++;
            }
            break;
        }

        for (int[] array3: a ) {
            for (int wert1: array3 ) {
                arrayAZeile++;
            }
            break;
        }

        if (arrayASpalte == arrayBZeile){
            int[][] c = new int[arrayASpalte][arrayBZeile];          // zy

            for (int z = 0; z < arrayASpalte; z++) {
                for (int y = 0; y < arrayBZeile; y++) {
                    for (int x = 0; x < arrayAZeile; x++) {
                        c[z][y] += a[z][x] * b[x][y];
                    }
                }
            }

            System.out.println("__________________________");

            for(int i = 0; i < arrayASpalte; i++){
                for(int y = 0; y < arrayBZeile; y++){

                    System.out.print(c[i][y] + ";");
                }
                System.out.println();

            }
        }
        else {
            System.out.println("ERROR: MATRIXEN HABEN NICHT DIE GLEICHEN DINGA");
        }





    }
}
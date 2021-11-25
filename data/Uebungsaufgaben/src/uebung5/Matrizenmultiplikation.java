package uebung5;

public class Matrizenmultiplikation {
    public static void main(String[] args) {
        int a1[][] = {{1, 2, 3},{4, 5, 6}};
        int b1[][] = {{7, 8},{9, 10},{11, 12}};
        int summe = 0;
        int c1[][] = new int[2][2];

        
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                for (int k = 0; k < 3; k++){
                    summe = summe + a1[i][k] * b1[k][j];
                }
                c1[i][j] = summe;
                summe = 0;
            }
        }

        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(c1[i][j] + " ");
            }
            System.out.println();
        }
    }
}

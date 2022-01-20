package Probeklausur;

public class Sum {
    public static double[] sumPosNeg(double[] array) {
        double[] ergebnis = new double[2];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                ergebnis[0] += array[i];
            } else {
                ergebnis[1] += array[i];
            }


        }
        return ergebnis;
    }

    public static double avg(double[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        return (avg / array.length);
    }

    public static double[] matrixSumPosNeg(double[][] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumPosNeg(array[i]);
            }
        }
        return null;
    }

    public static int abs(double[] array) {
        int counter = 0;
        double[] erg = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                erg[i] = Math.abs(array[i]);
                counter ++;
            }
        }
        return counter;
    }

    public static double[][] splitPosNeg(double[] array) {
        double[][] erg = new double[2][];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {

            }
            if (array[i] > 0) {

            }
        }
        return erg;
    }


}

package Sequence;
//1,2,-1,4,-3,6,-5,8,-7,10

//1,-3,5,-7,9,-11,13,-15
public class Sequence {
    private static final int end = 100;

    public static void main(String[] args) {
        int number = 1;
        int increment = 1;
        boolean pos = true;
        System.out.println(number);;
        while (number < end) {
            if (pos) {
                number = number + increment;
            } else {
                number = number - increment;
            }
            System.out.print(number);
            System.out.print(", ");
            increment = increment + 2;
            pos = !pos;
        }

    }

}


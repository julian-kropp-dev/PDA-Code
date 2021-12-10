package uebung1;

public class Power { // corrected "Class" to "class"
    public static void main(String[] args){
        int a = 2; // renamed all integer to int and added semicolons (;)
        int b = 4;
        // calculated a to the power of b (a^b)
        int result = 1; // corrected "integer" to "int" and result value has to be 1 not 0
        while (b != 0){ // "repeat" does not exist, only while, in a while loop you don't need to classify the variable name
            result *= a;
            b -= 1;
        }
        // output result of 2^4
        System.out.println(result); // result can be printed with "System.out.println(result)"
    }
}

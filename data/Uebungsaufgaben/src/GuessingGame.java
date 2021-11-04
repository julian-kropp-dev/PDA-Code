import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101.0); //Math.random creates a random int between 0 and 1. *101 to convert it to a random int between 0-100
        int guesses = 0; //users guesses
        while (true){ // while the user's guess is incorrect, it asks the user each time for a new guess
            Scanner userInput = new Scanner(System.in);
            System.out.println("Zahl:");
            int usersGuess = userInput.nextInt();
            if (usersGuess > randomNumber){
                System.out.println("Zufallszahl ist kleiner!");
                guesses += 1;
            }
            else if (usersGuess < randomNumber){
                System.out.println("Zufallszahl ist groesser!");
                guesses += 1;
            }
            else {
                System.out.println("Geschafft! Zufallszahl war " + randomNumber);
                System.out.println("Anzahl der Versuche: " + (guesses + 1));
                break; //random number guessed, while-loop ends

            }
        }
    }
}

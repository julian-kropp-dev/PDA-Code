import java.util.Scanner;
public class GuessingGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101.0);
        int guesses = 0;
        boolean guess = false;
        while (!guess){
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
                System.out.println("Anzahl der Versuche: " + guesses);
                guess = true;

            }
        }
    }
}

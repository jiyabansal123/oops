
import java.util.*;

public class number_guessing_game {
    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // 1 to 100
        int K = 5;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;

        System.out.println("A number is chosen between 1 to 100. Guess the number within 5 trials.");
        while (!hasGuessedCorrectly) {
            
        
        for (int i = 0; i < K; i++) {
            System.out.println("Enter your guess:");
            int guess = sc.nextInt();
            attempts++;
            if (guess == number) {
                System.out.println("Congratulations! You got it.");
                hasGuessedCorrectly = true;
                 
                break;
            } else if (number > guess) {
                System.out.println("The number is greater than your guess: " + guess);
            } else {
                System.out.println("The number is less than your guess: " + guess);
            }
        }
        if (!hasGuessedCorrectly){
            System.out.println("You used all your attempts, the correct number was: " + number);
            System.out.println("do you want to play again? (yes/no)");
            String response = sc.next();
            if (!response.equalsIgnoreCase("yes")) {
                System.out.println("game over , the correct number was : " + number);
                break;
            }
        }
        
    }
    sc.close();
    }       

    public static void main(String[] args) {
        guessingNumberGame();
    }
}

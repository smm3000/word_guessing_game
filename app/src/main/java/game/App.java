/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package game;

import java.util.Scanner;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        WordChoser wordchoser = new WordChoser();
        Game game = new Game(wordchoser);
        System.out.println("Welcome! Today the word to guess is:\n" + game.getWordToGuess());
    
        do {
            System.out.println("Enter one letter to guess (" + game.getRemainingAttempts() + " attempts remaining)");
            Scanner scan = new Scanner(System.in);
            Character input = scan.nextLine().charAt(0);
            Boolean result = game.guessLetter(input);
            
            if (result) {
                if (game.isGameWon()) {
                    System.out.println("Right! You have won the game!");
                    System.out.println(game.getWordToGuess());
                } else {
                    System.out.println("Right!");
                }
            } else {
                if (game.isGameLost()) {
                    System.out.println("Wrong! You lost");
                } else {
                    System.out.println("Wrong");
                }
            }
        }

        while (Boolean.FALSE.equals(game.isGameLost()));
        System.out.println("You lose :(");
    }
}

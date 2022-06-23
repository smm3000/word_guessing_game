package game;

import java.util.ArrayList;

public class Game {

    private String word;
    private ArrayList<Character> guessedLetters = new ArrayList<Character>();
    private int remainingAttempts = 10;

    public Game(WordChoser choser) {
        this.word = choser.getRandomWordFromDictionary();
    }

    public String getWordToGuess() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = this.word.charAt(i);
            if (i == 0) {
                builder.append(currentLetter);
            } else {
                builder.append("_");
            }
        }
        return builder.toString();

    }

    public int getRemainingAttempts() {
        return remainingAttempts;
    }

    public Boolean guessLetter(Character letter) {
        if (this.word.indexOf(letter) != -1) {
            guessedLetters.add(letter);
            return true;
        } else {
            remainingAttempts--;
            return false;
        }
    }

    public Boolean isGameLost() {
        if (remainingAttempts == 0) {
            return true; 
        } else {
            return false;
        }
        
    }
}


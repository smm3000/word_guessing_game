package game;

public class Game {

    String word;
    int remainingAttempts = 10; 

    public Game (WordChoser choser) { 
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


}

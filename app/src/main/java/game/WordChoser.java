package game;

import java.util.Random;

public class WordChoser {

    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

    public String getRandomWordFromDictionary() {
        Random random = new Random();
        int index = random.nextInt(DICTIONARY.length);
        return DICTIONARY[index];
    }
    
}

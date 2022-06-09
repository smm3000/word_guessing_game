package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
    @Test
    public void testGetsWordToGuess() {
        Game game = new Game("MAKERS");
        assertEquals("M_____", game.getWordToGuess());
    }

    @Test
    public void testGetsRemainingAttempts() {
        Game game = new Game("MAKERS"); 
        int result = Integer.valueOf(10); 
        assertEquals(result, game.getRemainingAttempts());
    }
}

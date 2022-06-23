package game;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.*;

import org.junit.Test;

public class GameTest {
    @Test
    public void testGetsWordToGuess() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        assertEquals("D________", game.getWordToGuess());
    }

    @Test
    public void testGetsRemainingAttempts() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        int result = Integer.valueOf(10); 
        assertEquals(result, game.getRemainingAttempts());
    }

    @Test
    public void testGetsWordToGuessWithRandomWord() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        assertEquals("D________", game.getWordToGuess());
    }

    @Test 
    public void testGuessRightLetterAndDisplayGuessedLetter() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        assertEquals(true, game.guessLetter('D'));
    }

    @Test 
    public void testGuessLetterWrong() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        assertEquals(false, game.guessLetter('Z'));
    }

    @Test 
    public void testisGameLost() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromDictionary()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        game.guessLetter('X');
        assertEquals(true, game.isGameLost());
    }
}


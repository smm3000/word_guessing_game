package game;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WordChoserTest {

    @Test
    public void testGetsRandomWordFromDictionary() {
        WordChoser underTest = new WordChoser();
        String result = "MAKERS";
        assertEquals(result, underTest.getRandomWordFromDictionary());
    }

    
}

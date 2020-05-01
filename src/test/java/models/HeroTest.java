package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    @Test
    public void testForHeroes() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals(true, myHeroes instanceof Hero);
    }

}

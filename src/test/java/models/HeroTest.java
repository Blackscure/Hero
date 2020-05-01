package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    @Test
    public void testForHeroes() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals(true, myHeroes instanceof Hero);
    }


    @Test
    public void testForAge() throws Exception {
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals(22, myHeroes.getAge());
    }

    @Test
    public void testForSpecialPowers() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals("Speed",myHeroes.getPower());
    }

    @Test
    public void testForWeakness() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals("Stress", myHeroes.getWeakness());
    }

    @Test
    public void testForId() {
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals(0, myHeroes.getId());
    }

}

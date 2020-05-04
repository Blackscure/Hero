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
        assertEquals(47, myHeroes.getAge());
    }

    @Test
    public void testForSpecialPowers() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals("Acuracy",myHeroes.getPower());
    }

    @Test
    public void testForWeakness() throws Exception{
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals("Love", myHeroes.getWeakness());
    }

    @Test
    public void testForId() {
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals(0, myHeroes.getId());
    }


    @Test
    public void testForName() throws Exception {
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        assertEquals("Hulk", myHeroes.getName());
    }

    @Test
    public void deleteAllHeroesDeletesAllHeroes() throws Exception {
        Hero myHeroes = new Hero("Hulk",47, "Acuracy", "Love");
        Hero.clearAllHero();
        assertEquals(0, Hero.getAll().size());
    }

}

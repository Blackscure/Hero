package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HeroTest {
    @Test
    public void newHeroInstantiatesCorrectly_true(){
        Hero hero= setUpNewHero();
        assertEquals(true,hero instanceof Hero);
    }

    @Test
    public void heroMustHaveAName(){
        Hero hero =setUpNewHero();
        assertEquals("hulk",hero.getName());
    }

    @Test
    public void  getPowerChecksTheHerosPower(){
        Hero hero = setUpNewHero();
        assertEquals("height",hero.getPower());
    }
}

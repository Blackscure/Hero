package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquadTest {

    @Test
    public void testForSquadName() throws Exception{
        Squad mySquad = new Squad("Avengers",5,"protect Earth");
        assertEquals("Avengers",mySquad.getName());
    }
}

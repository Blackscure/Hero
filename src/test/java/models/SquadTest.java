package models;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquadTest {

    @Test
    public void testForSquadName() throws Exception{
        Squad mySquad = new Squad("Avengers",5,"protect Earth");
        assertEquals("Avengers",mySquad.getName());
    }

    @Test
    public void testForSquadNumber() throws Exception{
        Squad mySquad = new Squad("Avengers",3,"protect Earth");
        assertEquals(3,mySquad.getMaxNum());
    }

    @Test
    public void testForSquadCause() throws Exception{
        Squad mySquad = new Squad("Avengers",3,"protect Earth");
        assertEquals("protect Earth", mySquad.getCause());
    }
}

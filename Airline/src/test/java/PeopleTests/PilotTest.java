package PeopleTests;

import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Amelia Earhart", Rank.PILOT, "PL-1897 07 24");
    }

    @Test
    public void hasName(){
        assertEquals("Brian Dowling", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.PURSER, pilot.getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("PL-1897 07 24", pilot.getLicence());
    }


}

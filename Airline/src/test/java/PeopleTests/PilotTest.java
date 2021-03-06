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
        assertEquals("Amelia Earhart", pilot.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.PILOT, pilot.getRank());
    }

    @Test
    public void hasLicence(){
        assertEquals("PL-1897 07 24", pilot.getLicenceNo());
    }

    @Test
    public void canFly(){
        assertEquals("Yippee, I'm flying! Look, no hands!", pilot.flyPlane());
    }


}

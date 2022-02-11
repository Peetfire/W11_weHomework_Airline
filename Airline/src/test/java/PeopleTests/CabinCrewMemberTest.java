package PeopleTests;

import People.CabinCrewMember;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember crewMember;

    @Before
    public void before(){
        crewMember = new CabinCrewMember("Brian Dowling", Rank.PURSER);
    }

    @Test
    public void hasName(){
        assertEquals("Brian Dowling", crewMember.getName());
    }

    @Test
    public void hasRank(){
        assertEquals(Rank.PURSER, crewMember.getRank());
    }
}

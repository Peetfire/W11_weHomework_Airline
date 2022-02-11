package FlyingTests;

import Flying.Flight;
import Flying.Plane;
import Flying.PlaneType;
import People.CabinCrewMember;
import People.Pilot;
import People.Rank;
import Flying.APCode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    ArrayList<Pilot> pilots;
    Pilot pilot;
    Pilot co_Pilot;
    ArrayList<CabinCrewMember> cabinCrew;
    CabinCrewMember cabCrew1;
    CabinCrewMember cabCrew2;
    CabinCrewMember cabCrew3;
    CabinCrewMember cabCrew4;
    Plane plane;

    @Before
    public void main(){
        pilot = new Pilot("Amelia Earhart", Rank.PILOT, "PL-1897 07 24");
        co_Pilot = new Pilot("Bessie Coleman", Rank.CO_PILOT, "PL 1892 01 26");
        pilots = new ArrayList<>(Arrays.asList(pilot, co_Pilot));
        cabCrew1 = new CabinCrewMember("Brian Dowling", Rank.PURSER);
        cabCrew2 = new CabinCrewMember("Hans Down", Rank.AIR_STEWARD);
        cabCrew2 = new CabinCrewMember("Lydia Teapot", Rank.AIR_HOSTESS);
        cabCrew4 = new CabinCrewMember("Ivor Czestikov", Rank.TRAINEE);
        cabinCrew = new ArrayList<>(Arrays.asList(cabCrew1, cabCrew2, cabCrew3, cabCrew4));
        plane = new Plane(PlaneType.AIRBUSBELUGA);
        flight = new Flight(pilots, cabinCrew, plane, "JA019283", APCode.EDI, APCode.EIS, "19:35");
    }

    @Test
    public void hasAtLeastOnePilot(){
        assertEquals(pilot.getName(), flight.getPilot().get(0).getName());
    }

    @Test
    public void hasASecondPilot(){
        assertEquals(co_Pilot.getName(), flight.getPilot().get(1).getName());
    }
}

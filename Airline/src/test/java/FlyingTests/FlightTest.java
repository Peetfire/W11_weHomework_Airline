package FlyingTests;

import Flying.Flight;
import Flying.Plane;
import Flying.PlaneType;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import Flying.APCode;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
    Passenger passenger;

    @Before
    public void main(){
        pilot = new Pilot("Amelia Earhart", Rank.PILOT, "PL-1897 07 24");
        co_Pilot = new Pilot("Bessie Coleman", Rank.CO_PILOT, "PL 1892 01 26");
        pilots = new ArrayList<>(Arrays.asList(pilot, co_Pilot));
        cabCrew1 = new CabinCrewMember("Brian Dowling", Rank.PURSER);
        cabCrew2 = new CabinCrewMember("Hans Doun", Rank.AIR_STEWARD);
        cabCrew3 = new CabinCrewMember("Lydia Teapot", Rank.AIR_HOSTESS);
        cabCrew4 = new CabinCrewMember("Ivor Czestikov", Rank.TRAINEE);
        cabinCrew = new ArrayList<>(Arrays.asList(cabCrew1, cabCrew2, cabCrew3, cabCrew4));
        plane = new Plane(PlaneType.AIRBUSBELUGA);
        flight = new Flight(pilots, cabinCrew, plane, "JA019283", APCode.EDI, APCode.EIS, "19:35");
        passenger = new Passenger("Peter Mordaunt", 2);
    }

    @Test
    public void hasAtLeastOnePilot(){
        assertEquals(pilot.getName(), flight.getPilot().get(0).getName());
    }

    @Test
    public void hasASecondPilot(){
        assertEquals(co_Pilot.getName(), flight.getPilot().get(1).getName());
    }

    @Test
    public void hasAtLeastOneCabinCrew(){
        assertEquals(cabCrew1.getName(), flight.getCabinCrew().get(0).getName());
    }

    @Test
    public void allCabinCrewPresent(){
        assertEquals(cabCrew1.getName(), flight.getCabinCrew().get(0).getName());
        assertEquals(cabCrew2.getName(), flight.getCabinCrew().get(1).getName());
        assertEquals(cabCrew3.getName(), flight.getCabinCrew().get(2).getName());
        assertEquals(cabCrew4.getName(), flight.getCabinCrew().get(3).getName());
    }

    @Test
    public void flightStartEmpty(){
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane.getType(), flight.getPlane().getType());
    }

    @Test
    public void hasFlightNo(){
        assertEquals("JA019283", flight.getFlightNo());
    }

    @Test
    public void hasDepartureAP(){
        assertEquals(APCode.EDI, flight.getDepartureAP());
    }

    @Test
    public void hasDestinationAP(){
        assertEquals(APCode.EIS, flight.getDestinationAP());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("19:35", flight.getDeptTime());
    }

    @Test
    public void canBookInAPassenger(){
        flight.bookInPassenger(passenger);
        assertTrue(flight.getPassengers().contains(passenger));
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canBookInManyPassengers(){
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        assertEquals(5, flight.getPassengers().size());
    }

    @Test
    public void canNotOverbookPlane(){
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);  // plane already full
        flight.bookInPassenger(passenger);  // plane already full
        assertEquals(5, flight.getPassengers().size());
    }

    @Test
    public void canFindRemainingCapacityEmpty(){
        assertEquals(5, flight.getAvailability());
    }

    @Test
    public void canFindRemainingCapacityFull(){
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        assertEquals(0, flight.getAvailability());
    }

    @Test
    public void canFindRemainingCapacitySpaces(){
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        flight.bookInPassenger(passenger);
        assertEquals(2, flight.getAvailability());
    }

}

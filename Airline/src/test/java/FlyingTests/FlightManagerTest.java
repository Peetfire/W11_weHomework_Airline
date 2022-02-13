package FlyingTests;

import Flying.*;
import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;
import People.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class FlightManagerTest {

    FlightManager flightManager;
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
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;

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
        plane = new Plane(PlaneType.AIRBUSA350);
        flight = new Flight(pilots, cabinCrew, plane, "JA019283", APCode.EDI, APCode.EIS, "19:35");
        passenger1 = new Passenger("Peter Mordaunt", 2);
        passenger2 = new Passenger("Peter Mordaunt", 5);
        passenger3 = new Passenger("Peter Mordaunt", 6);
        flightManager = new FlightManager(flight);
    }

    @Test
    public void hasFlight(){
        assertEquals(flight, flightManager.getFlight());
    }

    @Test
    public void canGetBaggageAllowance(){
        assertEquals(50, flightManager.getBaggageAllowance());
    }

    @Test
    public void canBookInPassengerUnderweight(){
        assertTrue(flightManager.bookInPassenger(passenger1));
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canBookInPassengerOnWeight(){
        assertTrue(flightManager.bookInPassenger(passenger2));
        assertEquals(1, flight.getPassengers().size());
    }

    @Test
    public void canNotBookInPassengerOverweight(){
        assertFalse(flightManager.bookInPassenger(passenger3));
        assertEquals(0, flight.getPassengers().size());
    }

    @Test
    public void canGetTotalBookedBaggageWeightEmpty(){
        assertEquals(0, flightManager.getTotBookedBaggageWeight());
    }

//    @Test
//    public void canGetTotalBookedBaggageWeightFull(){
//        flightManager.bookInPassenger(passenger);
//        flightManager.bookInPassenger(passenger);
//        flightManager.bookInPassenger(passenger);
//        flightManager.bookInPassenger(passenger);
//        flightManager.bookInPassenger(passenger);
//
//    }
//
//    @Test
//    public void canGetTotalBookedBaggageWeightMid(){
//
//    }




}

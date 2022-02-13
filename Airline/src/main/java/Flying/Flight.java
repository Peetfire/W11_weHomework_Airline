package Flying;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.time.LocalTime;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private APCode destinationAP;
    private APCode departureAP;
    private LocalTime deptTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNo, APCode departureAP, APCode destinationAP, LocalTime deptTime) {
        this.pilots = pilots;
        this.cabinCrew = cabinCrew;
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNo = flightNo;
        this.destinationAP = destinationAP;
        this.departureAP = departureAP;
        this.deptTime = deptTime;
    }

    public ArrayList<Pilot> getPilot() {
        return this.pilots;
    }

    public ArrayList<CabinCrewMember> getCabinCrew() {
        return this.cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return this.passengers;
    }

    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public APCode getDestinationAP() {
        return destinationAP;
    }

    public APCode getDepartureAP() {
        return departureAP;
    }

    public LocalTime getDeptTime() {
        return deptTime;
    }

    public void bookInPassenger(Passenger passenger) {
        if(passengers.size() < plane.getSeatCapacity()){
            passengers.add(passenger);
        }
    }

    public int getAvailability() {
        return (plane.getSeatCapacity() - passengers.size());
    }
}

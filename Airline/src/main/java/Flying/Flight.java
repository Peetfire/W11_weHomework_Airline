package Flying;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Flight {
    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrewMember> cabinCrew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNo;
    private APCode destinationAP;
    private APCode departureAP;
    private String deptTime;

    public Flight(ArrayList<Pilot> pilots, ArrayList<CabinCrewMember> cabinCrew, Plane plane, String flightNo, APCode destinationAP, APCode departureAP, String deptTime) {
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
}

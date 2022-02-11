package Flying;

import People.CabinCrewMember;
import People.Passenger;
import People.Pilot;

import java.util.ArrayList;
import java.util.List;

public class Flight {
    ArrayList<Pilot> pilots;
    ArrayList<CabinCrewMember> cabinCrew;
    ArrayList<Passenger> passengers;
    Plane plane;
    String flightNo;
    APCode destinationAP;
    APCode departureAP;
    String deptTime;

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
}

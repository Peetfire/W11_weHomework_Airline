package Flying;

import People.Passenger;

public class FlightManager {
    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int getBaggageAllowance() {
        return (flight.getPlane().getWeightCapacity()/flight.getPlane().getSeatCapacity());
    }

    public boolean bookInPassenger(Passenger passenger) {
        if(passenger.getTotalWeight() <= this.getBaggageAllowance()){
            flight.bookInPassenger(passenger);
            return true;
        }
        return false;
    }

    public int getTotBookedBaggageWeight() {
        return (flight.getPassengers().stream().mapToInt(passenger -> passenger.getTotalWeight()).sum());
    }

    public int getTotRemainingBaggageWeight() {
        return (flight.getPlane().getWeightCapacity() - this.getTotBookedBaggageWeight());
    }
}

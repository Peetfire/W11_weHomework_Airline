package Flying;

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
}

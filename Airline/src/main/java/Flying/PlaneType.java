package Flying;

public enum PlaneType {
    // capacity is the total number of people the plane can hold
    // weight is the total baggage weight a plane can hold
    BOEING747(200, 8000),
    BOEING747400(400, 16000),
    BOEING737(150, 4500),
    AIRBUSBELUGA(300, 12000),
    AIRBUSA380(100, 2500),
    AIRBUSA350(5, 1875);

    private final int capacity;
    private final int baggageWeight;

    PlaneType(int capacity, int baggageWeight) {
        this.capacity = capacity;
        this.baggageWeight = baggageWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBaggageWeight() {
        return baggageWeight;
    }
}

package Flying;

public enum PlaneType {
    // capacity is the total number of people the plane can hold
    // weight is the total baggage weight a plane can hold
    BOEING747(200, 8000),
    BOEING747400(400, 16000),
    BOEING737(150, 4500),
    AIRBUSBELUGA(300, 12000),
    AIRBUSA380(100, 2500),
    AIRBUSA350(5, 250);

    private final int seatCapacity;
    private final int weightCapacity;

    PlaneType(int seatCapacity, int weightCapacity) {
        this.seatCapacity = seatCapacity;
        this.weightCapacity = weightCapacity;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public int getWeightCapacity() {
        return weightCapacity;
    }
}

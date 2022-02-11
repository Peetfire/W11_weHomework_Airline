package Flying;

public enum PlaneType {
    // capacity is the total number of people the plane can hold
    // weight is the total baggage weight a plane can hold
    BOEING747(200, 8000),
    BOEING747400(400, 16000),
    BOEING737(150, 4500),
    AIRBUSBELUGA(5, 12000),
    AIRBUSA380(100, 2500),
    AIRBUSA350(75, 1875);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}

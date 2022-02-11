package Flying;

public enum APCode {
    EDI(1),
    GLA(2),
    DUB(3),
    JFK(4),
    LON(5),
    MAL(6),
    AKL(7),
    EIS(8),
    DDC(9),
    NCL(10),
    ABZ(11);

    private final int value;

    APCode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

package People;

public enum Message {
    SEATBELTS("When the sign is illuminated please return to your seat and fasten your seatbelt."),
    BRIEFING("Please pay attention to the in flight safety briefing"),
    DRINKS("Drink are now being served from the trolley"),
    FOOD("Your in-flight meal will be served shortly"),
    LANDING("Cabin-crew, prepare for landing");

    private final String value;

    Message(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}

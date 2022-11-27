package transport;

public enum PlaceType {

    ESPECIALLY_SMALL(0, 10),
    SMALL(0, 25),
    MEDIUM(40,50),
    LARGE(60, 80),
    ESPECIALLY_LARGE(100, 120);

    private final int capacityFrom;
    private final int capacityTo;

    PlaceType(int capacityFrom, int capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacity;
        if (capacityFrom > 0) capacity = capacityFrom + "-" + capacityTo;
        else capacity = String.valueOf(capacityTo);
        return capacity + " мест.";
    }

}

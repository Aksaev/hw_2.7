package transport;

public enum CapacityType {

    N1(null, 3.5f),
    N2(3.5f, 12f),
    N3(12f, null);

    private final Float capacityFrom;
    private final Float capacityTo;

    CapacityType(Float capacityFrom, Float capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        String capacityFromString = null;
        String capacityToString = null;

        if (capacityFrom != null && capacityTo != null) {
            capacityFromString = "от " + capacityFrom;
            capacityToString = " до " + capacityTo + " тонн";
            return "Грузоподъемность " + capacityFromString + "" + capacityToString + ".";

        }
        if (capacityFrom != null && capacityTo == null) {
            capacityFromString = "от " + capacityFrom + " тонн";
            return "Грузоподъемность " + capacityFromString + ".";
        }
        if (capacityFrom == null && capacityTo != null) {
            capacityToString = "до " + capacityTo + " тонн";
        }
        return "Грузоподъемность " + capacityToString + ".";
    }
}

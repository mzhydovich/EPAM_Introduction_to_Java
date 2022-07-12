package SimpleClassesAndObjects;

public class Airline {

    private String destinationPoint;
    private String raiseNumber;
    private String typeOfAirline;
    private String timeOfStart;
    private String dayOfWeek;

    public Airline() {
        super();
    }

    public Airline(String destinationPoint, String raiseNumber, String typeOfAirline, String timeOfStart,
                   String dayOfWeek) {
        super();
        this.destinationPoint = destinationPoint;
        this.raiseNumber = raiseNumber;
        this.typeOfAirline = typeOfAirline;
        this.timeOfStart = timeOfStart;
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "Airline [destinationPoint=" + destinationPoint + ", raiseNumber=" + raiseNumber + ", typeOfAirline="
                + typeOfAirline + ", timeOfStart=" + timeOfStart + ", dayOfWeek=" + dayOfWeek + "]";
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public String getRaiseNumber() {
        return raiseNumber;
    }

    public void setRaiseNumber(String raiseNumber) {
        this.raiseNumber = raiseNumber;
    }

    public String getTypeOfAirline() {
        return typeOfAirline;
    }

    public void setTypeOfAirline(String typeOfAirline) {
        this.typeOfAirline = typeOfAirline;
    }

    public String getTimeOfStart() {
        return timeOfStart;
    }

    public void setTimeOfStart(String timeOfStart) {
        this.timeOfStart = timeOfStart;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

}

package SimpleClassesAndObjects;

import java.util.Comparator;

public class Train implements Comparable<Train>  {

    private String stationName;
    private int trainNumber;
    private String timeOfDeparture;

    public Train(String stationName, int trainNumber, String timeOfDeparture) {
        this.stationName = stationName;
        this.trainNumber = trainNumber;
        this.timeOfDeparture = timeOfDeparture;
    }

    public String getStationName() {
        return stationName;
    }

    public void setName(String stationName) {
        this.stationName = stationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public String getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(String timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }

    public static Comparator<Train> TrainNumberComparator = new Comparator<Train>() {

        @Override
        public int compare(Train t1, Train t2) {
            return (int) (t1.getTrainNumber() - t2.getTrainNumber());
        }
    };


    public static Comparator<Train> StationNameComparator = new Comparator<Train>() {

        @Override
        public int compare(Train t1, Train t2) {
            int value1 = t1.getStationName().compareTo(t2.getStationName());

            if(value1 == 0) {
                return (t1.getTimeOfDeparture().compareTo(t2.getTimeOfDeparture()));
            }
            return value1;
        }
    };

    @Override
    public String toString() {
        return "Train{" + "Station name = " + stationName + ", Train number = " + trainNumber + ", Time of departure = "
                + timeOfDeparture + '}';
    }

    @Override
    public int compareTo(Train o) {
        return this.getTimeOfDeparture().compareTo(o.getTimeOfDeparture());
    }
}

package SimpleClassesAndObjects;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AirlineContainer {

    private Airline[] airlines;
    private int size;
    private int capacity;
    private int key;

    Map<Integer, String> cities = new HashMap<Integer, String>();
    Map<Integer, String> days = new HashMap<Integer, String>();

    public AirlineContainer(int capacity_) {
        size = 0;
        capacity = capacity_;
        airlines = new Airline[capacity];

    }

    public void pushAirline(Airline airline) {
        if (size < capacity) {
            airlines[size] = airline;
            size++;
        } else {
            Airline[] tmp = new Airline[capacity];
            tmp = airlines;

            airlines = new Airline[capacity * 2];
            System.arraycopy(tmp, 0, airlines, 0, tmp.length);
            airlines[size] = airline;
            size++;
            capacity = capacity * 2;

        }

        cities.put(key, airline.getDestinationPoint());
        key++;

    }

    public void printAirline() {
        for (int i = 0; i < size; i++) {
            System.out.println(airlines[i].toString());

        }
    }

    public void printDestinationPoints() {

        for (Map.Entry<Integer, String> item : cities.entrySet()) {

            System.out.printf("Press %d for %s \n", item.getKey(), item.getValue());
        }

    }

    public void findAirlineByDestinationPoint(int index) {

        String city = cities.get(index);

        for (int i = 0; i < size; i++) {
            if (airlines[i].getDestinationPoint().equals(city)) {
                System.out.println(airlines[i].toString());
            }
        }
    }

    public void printDaysOfWeek() {

        days.put(1, "monday");
        days.put(2, "tuesday");
        days.put(3, "wensday");
        days.put(4, "thursday");
        days.put(5, "friday");
        days.put(6, "saturday");
        days.put(7, "sunday");

        for (Map.Entry<Integer, String> item : days.entrySet()) {

            System.out.printf("Press %d for %s \n", item.getKey(), item.getValue());
        }
    }

    public void findAirlineByDayOfWeek(int index) {

        String day = days.get(index);

        for (int i = 0; i < size; i++) {
            if (airlines[i].getDayOfWeek().equals(day)) {
                System.out.println(airlines[i].toString());
            }
        }
    }

    public void findAirlineByDayOfWeekAndTime(int index) {
        Scanner sc = new Scanner(System.in);

        String day = days.get(index);
        System.out.println("Please, enter time in format HH:MM");
        String time = sc.next();

        for (int i = 0; i < size; i++) {
            if (airlines[i].getDayOfWeek().equals(day) && time.compareTo(airlines[i].getTimeOfStart())<0 ) {
                System.out.println(airlines[i].toString());
            }
        }
    }

}

package SimpleClassesAndObjects;

import java.util.Scanner;

public class Counter {

    private int upLimit;
    private int downLimit;
    private int value;

    public Counter() {

    }

    public Counter(int upLimit, int downLimit, int value) {
        this.upLimit = upLimit;
        this.downLimit = downLimit;
        this.value = value;
    }

    public int getUpLimit() {
        return upLimit;
    }

    public void setUpLimit(int upLimit) {
        if (upLimit > getDownLimit()) {
            this.upLimit = upLimit;
        } else {
            setUpLimit(intChecking());
        }
    }

    public int getDownLimit() {
        return downLimit;
    }

    public void setDownLimit(int downLimit) {
        this.downLimit = downLimit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > getDownLimit() && value < getUpLimit()) {
            this.value = value;
        } else {
            setValue(intChecking());
        }
    }


    public void increment() {
        int newValue;

        if (getValue() < getUpLimit()) {
            newValue = getValue();
            newValue++;
            setValue(newValue);
        }

    }

    public void decrement() {
        int newValue;

        if (getValue() > getDownLimit()) {
            newValue = getValue();
            newValue--;
            setValue(newValue);
        }

    }

    public static int intChecking() {

        String str;
        int value;

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        while (!sc.hasNextInt()) {
            str = sc.nextLine();
            System.out.println("Try again, " + str + " it's not a Integer");
        }
        value = sc.nextInt();

        return value;

    }

    @Override
    public String toString() {
        return "Counter random value=" + value;
    }

}
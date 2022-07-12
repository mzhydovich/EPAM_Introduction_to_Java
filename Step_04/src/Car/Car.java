package Car;

public class Car {

    Wheel wheel1;
    Wheel wheel2;
    Wheel wheel3;
    Wheel wheel4;
    SparedWheel sparedWheel;
    Engine engine;
    String name;
    int fuelInTank;

    public String getName() {
        return name;
    }

    public Car(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4, Engine engine, String name) {
        super();
        this.wheel1 = wheel1;
        this.wheel2 = wheel2;
        this.wheel3 = wheel3;
        this.wheel4 = wheel4;
        this.engine = engine;
        this.name = name;
        fuelInTank = 100;
        sparedWheel = new SparedWheel();
    }

    public SparedWheel getSparedWheel() {
        return sparedWheel;
    }

    public void setSparedWheel(SparedWheel sparedWheel) {
        this.sparedWheel = sparedWheel;
    }

    public Wheel getWheel1() {
        return wheel1;
    }

    public void setWheel1(Wheel wheel1) {
        this.wheel1 = wheel1;
    }

    public Wheel getWheel2() {
        return wheel2;
    }

    public void setWheel2(Wheel wheel2) {
        this.wheel2 = wheel2;
    }

    public Wheel getWheel3() {
        return wheel3;
    }

    public void setWheel3(Wheel wheel3) {
        this.wheel3 = wheel3;
    }

    public Wheel getWheel4() {
        return wheel4;
    }

    public void setWheel4(Wheel wheel4) {
        this.wheel4 = wheel4;
    }

    public int getFuelInTank() {
        return fuelInTank;
    }

    public void setFuelInTank(int fuelInTank) {
        this.fuelInTank = fuelInTank;
    }

    @Override
    public String toString() {
        return "Car [wheel1=" + wheel1 + ", wheel2=" + wheel2 + ", wheel3=" + wheel3 + ", wheel4=" + wheel4 + ", name="
                + name + ", fuelInTank=" + fuelInTank + "]";
    }

}

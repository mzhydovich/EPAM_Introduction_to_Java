package SimpleClassesAndObjects;

public class Test2 {

    double a;
    double b;

    public Test2() {
        a = 1;
        b = 2;
    }

    public Test2(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

}
package SimpleClassesAndObjects;

public class Triangle {

    private int Ax;
    private int Ay;
    private int Bx;
    private int By;
    private int Cx;
    private int Cy;

    public Triangle() {
        super();
    }

    public Triangle(int ax, int ay, int bx, int by, int cx, int cy) {
        super();
        Ax = ax;
        Ay = ay;
        Bx = bx;
        By = by;
        Cx = cx;
        Cy = cy;
    }

    public int getAx() {
        return Ax;
    }

    @Override
    public String toString() {
        return "Triangle " + "[A[" + Ax + " ; " + Ay + "] " + "B[" + Bx + " ; " + By + "] " + "C[" + Cx + " ; " + Cy
                + "] ]";
    }

    public void setAx(int ax) {
        Ax = ax;
    }

    public int getAy() {
        return Ay;
    }

    public void setAy(int ay) {
        Ay = ay;
    }

    public int getBx() {
        return Bx;
    }

    public void setBx(int bx) {
        Bx = bx;
    }

    public int getBy() {
        return By;
    }

    public void setBy(int by) {
        By = by;
    }

    public int getCx() {
        return Cx;
    }

    public void setCx(int cx) {
        Cx = cx;
    }

    public int getCy() {
        return Cy;
    }

    public void setCy(int cy) {
        Cy = cy;
    }

    public double areaChecking(int x1, int y1, int x2, int y2, int x3, int y3) {

        System.out.println("((x1 - x3) * (y2 - y3) " + ((x1 - x3) * (y2 - y3)));
        System.out.println("(y1 - y3) * (x2 - x3)) " + ((y1 - y3) * (x2 - x3)));

        return Math.abs((((x1 - x3) * (y2 - y3)) - ((y1 - y3) * (x2 - x3))) / 2);

    }

    public double perimetrChecking(int x1, int y1, int x2, int y2, int x3, int y3) {
        double ab;
        double bc;
        double ac;
        ab = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("ab = " + ab);
        bc = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        System.out.println("ab = " + bc);
        ac = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        System.out.println("ab = " + ac);

        return ab + bc + ac;
    }

    public void spotOfIntersection() {
        int x1 = getAx();
        int y1 = getAy();
        int x2 = getBx();
        int y2 = getBy();
        int x3 = getCx();
        int y3 = getCy();

        double intersectionX;
        double intersectionY;

        intersectionX = ((x1 + x2 + x3)) / 3.0;
        intersectionY = ((y1 + y2 + y3)) / 3.0;

        System.out.println("Spot of Intersection [" +intersectionX+","+intersectionY+"]");

    }

}

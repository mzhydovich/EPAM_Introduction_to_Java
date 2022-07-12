package Country;

import java.util.ArrayList;

public class District {

    String name;
    ArrayList<City> Cities = new ArrayList<City>();
    int area;

    public District(String name, int area) {
        super();
        this.name = name;
        this.area = area;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "District [name=" + name + ", Citys=" + Cities + ", area=" + area + "]";
    }

}

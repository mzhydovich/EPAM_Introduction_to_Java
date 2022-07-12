package Country;

import java.util.ArrayList;

public class Country {

    String name;
    City capital;
    int area;
    ArrayList<Region> Regions = new ArrayList<Region>();

    public Country(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public ArrayList<Region> getRegions() {
        return Regions;
    }

    public void setRegions(ArrayList<Region> regions) {
        Regions = regions;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

}

package Country;

import java.util.ArrayList;

public class Region {

    String name;
    City regionCentre;
    ArrayList<District> Districts = new ArrayList<District>();
    int area;

    public Region(String name, City regionCentre) {
        super();
        this.name = name;
        this.regionCentre = regionCentre;

    }

    public City getRegionCentre() {
        return regionCentre;
    }

    public void setRegionCentre(City regionCentre) {
        this.regionCentre = regionCentre;
    }

    public ArrayList<District> getDistricts() {
        return Districts;
    }

    public void setDistricts(ArrayList<District> districts) {
        Districts = districts;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Region [name=" + name + ", regionCentre=" + regionCentre + ", Districts=" + Districts + "]";
    }

}

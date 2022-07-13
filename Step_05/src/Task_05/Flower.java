package Task_05;

import java.util.Objects;

public abstract class Flower {
	
	private String name;
	private int price;
	private String color;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public void flowerIdentification() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		return Objects.equals(color, other.color) && Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "Flower [name=" + name + ", price=" + price + ", color=" + color + "]";
	}

}

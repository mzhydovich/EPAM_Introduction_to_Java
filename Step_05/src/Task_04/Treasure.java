package Task_04;

import java.io.Serializable;
import java.util.Objects;

public class Treasure implements Serializable {

	private static final long serialVersionUID = -361470058016790987L;

	private int id;
	private String name;
	private int price;

	public Treasure() {

	}

	public Treasure(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Treasure other = (Treasure) obj;
		return id == other.id && Objects.equals(name, other.name) && price == other.price;
	}

	@Override
	public String toString() {
		return "\nTreasure [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

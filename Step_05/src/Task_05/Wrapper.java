package Task_05;

import java.util.Objects;

public class Wrapper {
	
	private int price = 10;

	public Wrapper() {
		super();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return Objects.hash(price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrapper other = (Wrapper) obj;
		return price == other.price;
	}

	@Override
	public String toString() {
		return "Wrapper [price=" + price + "]";
	}

}

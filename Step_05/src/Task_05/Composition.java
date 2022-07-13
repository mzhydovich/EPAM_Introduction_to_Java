package Task_05;

import java.util.Objects;

public class Composition {

	private int price;
	private Flower flower;
	private Wrapper wrapper;

	public Composition(Flower flower, Wrapper wrapper) {
		super();
		this.flower = flower;
		this.wrapper = wrapper;
		this.price = this.flower.getPrice() + this.wrapper.getPrice();
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Flower getFlower() {
		return flower;
	}

	public void setFlower(Flower flower) {
		this.flower = flower;
	}

	public Wrapper getWrapper() {
		return wrapper;
	}

	public void setWrapper(Wrapper wrapper) {
		this.wrapper = wrapper;
	}

	@Override
	public int hashCode() {
		return Objects.hash(flower, price, wrapper);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Composition other = (Composition) obj;
		return Objects.equals(flower, other.flower) && price == other.price && Objects.equals(wrapper, other.wrapper);
	}

	@Override
	public String toString() {
		return "Composition [price=" + price + ", flower=" + flower + ", wrapper=" + wrapper + "]";
	}

}

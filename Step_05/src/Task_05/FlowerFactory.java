package Task_05;

public class FlowerFactory {

	public Flower createFlower(String flowerType) {

		if (flowerType.equalsIgnoreCase("rose")) {
			return new Rose();
		} else

		if (flowerType.equalsIgnoreCase("tulip")) {
			return new Tulip();

		} else
			System.out.println("you better choose real flower");
			return null;
	}

}

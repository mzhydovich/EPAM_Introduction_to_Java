package Task_05;

public class Rose extends Flower{
	
	public Rose() {
		setName("Rose");
		setPrice(100);
		setColor("Red");
	}

	@Override
	public void flowerIdentification() {
		System.out.println("this is the Rose");
	}

}

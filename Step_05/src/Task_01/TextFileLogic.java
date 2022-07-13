package Task_01;

public class TextFileLogic extends FileLogic {

	@Override
	public TextFile fileCreating() {
		System.out.println("Enter file name");
		String name = sc.next();
		System.out.println("Enter way to creatig file");
		String way = sc.next();

		TextFile file = new TextFile(way, name);
		System.out.println("it's text file");
		
		return file;
	}

}

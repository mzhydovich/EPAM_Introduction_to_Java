package Task_01;

import java.util.Scanner;

public class File extends Directory {
	
	static Scanner sc = new Scanner(System.in);

	private String name;

	public File() {
		super();
		// TODO Auto-generated constructor stub
	}

	public File(String way) {
		super(way);
		// TODO Auto-generated constructor stub
	}

	public File(String way, String name) {
		super(way);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void fileRenaming() {
		System.out.println("��� ����� ������ FILE");
		System.out.println("Enter new name of File");
		String newName = sc.next();
		name = newName;

	}

	@Override
	public String toString() {
		return "File [name=" + name + ", getWay()=" + getWay() + "]";
	}

}
	


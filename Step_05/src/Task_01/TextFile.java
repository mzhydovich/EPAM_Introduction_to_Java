package Task_01;

import java.util.Scanner;

public class TextFile extends File {

	Scanner sc = new Scanner(System.in);
	private String content = "";
	
	public TextFile() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TextFile(String way) {
		super(way);
		// TODO Auto-generated constructor stub
	}

	public TextFile(String way, String name) {
		super(way, name);
		
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void textShowing() {
		System.out.println(getContent());
	}

	public void textUpdating(String uptext) {
		content = getContent() + uptext;
	}

	public void textDelete() {
		content = null;
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + ", getName()=" + getName() + ", getWay()=" + getWay() + "]";
	}

}

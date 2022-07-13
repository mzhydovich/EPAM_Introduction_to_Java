package Task_04;

import java.io.Serializable;
import java.util.Objects;

public class Dragon implements Serializable {

	private static final long serialVersionUID = -3798190325134461868L;
	private String name;
	private Cave cave;

	{
		cave = new Cave();
	}

	public Dragon() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dragon(String name, String caveName) {
		super();
		this.name = name;
		this.cave = new Cave(caveName);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Cave getCave() {
		return cave;
	}

	public void setCave(Cave cave) {
		this.cave = cave;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cave, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dragon other = (Dragon) obj;
		return Objects.equals(cave, other.cave) && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Dragon [name=" + name + ", cave=" + cave + "]";
	}

}

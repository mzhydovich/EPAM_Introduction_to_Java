package Task_04;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cave implements Serializable {

	private static final long serialVersionUID = 2136216708835860926L;
	private String name;
	private List<Treasure> treasures;
	
	{
		treasures = new ArrayList<Treasure>();
	}
	
	
	public Cave() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cave(String name) {
		super();
		this.name = name;
		this.treasures = new ArrayList<Treasure>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Treasure> getTreasures() {
		return treasures;
	}

	public void setTreasures(List<Treasure> treasures) {
		this.treasures = treasures;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(name, treasures);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cave other = (Cave) obj;
		return Objects.equals(name, other.name) && Objects.equals(treasures, other.treasures);
	}

	@Override
	public String toString() {
		return "Cave [name=" + name + ", treasures=" + treasures + "]";
	}

}

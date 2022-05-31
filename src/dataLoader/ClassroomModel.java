package dataLoader;

public class ClassroomModel {
	
	private int index;
	private int cod_type;
	private String type;
	private int capacity;
	private String name;
	
	public ClassroomModel(int index, int cod_type, String type, int capacity, String name) {
		super();
		this.index = index;
		this.cod_type = cod_type;
		this.type = type;
		this.capacity = capacity;
		this.name = name;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getCod_type() {
		return cod_type;
	}

	public void setCod_type(int cod_type) {
		this.cod_type = cod_type;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

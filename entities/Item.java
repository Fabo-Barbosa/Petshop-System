package entities;

public class Item {
	private static long countItem;
	private double value;
	// variável type: enum Type
	// variável pet: class Pet
	private String name;
	private long id;
	
	public Item() {
		Item.countItem ++;
	}
	
	// metodos gets
	public static long getQuantItem() {
		return Item.countItem;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String getName() {
		return this.name;
	}
	
	public long getId() {
		return this.id;
	}
	
	//metodos sets
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(long id) {
		this.id = id;
	}

}

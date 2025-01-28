package Week06;

//create Card Class with value and names as fields

public class Card {
	
	private String name;
	int value;
	

//Constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}

	//Getters and Setters
	
	public int getValue() {
		return value;
		}
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name =  name;
	}
	
	// describe method
	
	public void describe() {
		 System.out.println(name + " (" + value + ")");
	}
}
package greedy.fractionalKnapsack;

public class FractionalKnapsackItem {
	
	private int index;
	private int value;//value of total quantity
	private int weight;//available weight
	private double density;//value/unit
	
	public FractionalKnapsackItem(int index, int value,int weight) {
		this.weight=weight;
		this.value = value;
		this.index = index;
		this.density = (double)value/(double)weight; //only one conversion will also work	
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public double getDensity() {
		return density;
	}

	public void setDensity(double density) {
		this.density = density;
	}
	
	@Override
	public String toString() {
		return "Item: "+index+", Value:"+value+", Weight:"+weight+", Density:"+density;
		//return "Item: "+index+", Density:"+density;
	}
}

package divideAndConquer.houseThief;

public class HouseThief_DnC {
	//thief cant steal from 2 adjacent houses, maximize the value
	
	public int steal(int[] houses) {
		return steal(houses , 0);
	}

	private int steal(int[] houses, int i) {
		
		int stealCurrent = i+2<houses.length ? houses[i] + steal(houses, i+2) : houses[i] ;
		int skipCurrent  = i+1<houses.length ? 		0	 + steal(houses, i+1) : 0;
		/*
		if(i>=houses.length) {
			return 0;
		}
		int stealCurrent = houses[i] + steal(houses, i+2);
		int skipCurrent  = 0 + steal(houses, i+1);
		*/	
		return Math.max(stealCurrent, skipCurrent);
	}
	
	
	public static void main(String[] args) {
		HouseThief_DnC ht = new HouseThief_DnC();
		int[] HouseNetWorth = {6, 7, 1, 30, 8, 2, 4};
		System.out.println(ht.steal(HouseNetWorth));
		HouseNetWorth = new int[] {20, 5, 1, 13, 6, 11, 40};
		System.out.println(ht.steal(HouseNetWorth));
	}
	
}

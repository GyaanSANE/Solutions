package divideAndConquer.countWays;

public class CountWays_DnC {
	//find the number of ways in which N can be represented as a sum of 1,3,4
	
	int findWays(int n) {
		if(n<0) {
			return 0;
		}
		switch (n) {
			case 0: case 1://case 2: //{ } / {1} / {1,1}
				return 1;			// returns 1 in all 3 cases
			case 3: 
				return 2;
			//case 4: return 4;
			default: 
				int sub1 = findWays(n-1);
				int sub3 = findWays(n-3);
				int sub4 = findWays(n-4);
				return sub1+sub3+sub4;
		}
	}
	
	public static void main(String[] args) {
		CountWays_DnC en = new CountWays_DnC();
		System.out.println(en.findWays(4));
		System.out.println(en.findWays(5));
		System.out.println(en.findWays(10));
	}
}

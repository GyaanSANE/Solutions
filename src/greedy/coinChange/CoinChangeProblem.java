package greedy.coinChange;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

//calculate minimum number of coins(of available denominations) that sum up to required amount
public class CoinChangeProblem {
	private static LinkedHashMap<Integer,Integer> coinsMap = new LinkedHashMap<Integer,Integer>();//alternatively use another array of size coins.length and store numOfCoins at corresponding index for each denomination
	private static int totalCoins;
	
	public static void calculateCoins(int[] coins,int amount) {
		Arrays.sort(coins);
		int balance = amount;
		int i = coins.length-1;
		while(balance!=0 && i>=0) {
			if(balance>=coins[i]) {
				int numOfCoins = balance/coins[i];
				totalCoins += numOfCoins;
				balance = balance%coins[i];
				coinsMap.put(coins[i], numOfCoins);
			}
			i--;
		}
		printCoins();
		if(balance>0) {
			System.out.println("Balance: "+balance+" still remains.");
		}
	}

	private static void printCoins() {
		 for(Map.Entry<Integer, Integer> entry : coinsMap.entrySet()) {
			 System.out.println("Used "+entry.getValue()+" * "+entry.getKey());
		 }
		 System.out.println();
		 System.out.println("Total Coins Used: "+totalCoins);
		
	}

	
	
}

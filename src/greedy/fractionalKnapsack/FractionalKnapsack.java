package greedy.fractionalKnapsack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class FractionalKnapsack {
	
	//ArrayList<FractionalKnapsackItem> items;
	//int capacity;
	//static LinkedHashMap<Integer, Integer> selected= new LinkedHashMap<>();
	
	static Comparator<FractionalKnapsackItem> comparator = new Comparator<FractionalKnapsackItem>() {
		@Override
		public int compare(FractionalKnapsackItem a, FractionalKnapsackItem b) {
			return Double.compare(b.getDensity(), a.getDensity());
			/*if(b.getDensity()> a.getDensity()) {
				return 1;
			} else {
				return -1;
			}*/
		}
	};
	
	public static void fractionalKnapsack(ArrayList<FractionalKnapsackItem> items,int capacity) {
		//*
		Iterator<FractionalKnapsackItem> it = items.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//
		Collections.sort(items, comparator);
		//*
		System.out.println("*******************************************");
		System.out.println("Sorted List for most valuable items.");
		it = items.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("*******************************************\n");
		//
		
		int capacityLeft=capacity;
		int totalValue=0;
		int i=0;
		while(capacityLeft>0) {
			try {
				FractionalKnapsackItem curr = items.get(i);
				if(curr.getWeight()<=capacityLeft) {
					capacityLeft-= curr.getWeight();
					totalValue+= curr.getValue();
					System.out.println("Item "+curr.getIndex()+" taken fully ("+curr.getWeight()+" units)");
					//selected.put(curr.getIndex(), curr.getWeight());
					i++;
				}else {
					totalValue += curr.getValue()/curr.getWeight()*capacityLeft;
					System.out.println("Item "+curr.getIndex()+" taken partially ("+capacityLeft+" units)");
					capacityLeft=0;
					//selected.put(curr.getIndex(), capacityLeft);
				}
			}catch(Exception e) {
				System.out.println("No more items left to put.");
				break;
			}
		}
		System.out.println("\nTotal Value of Knapsack: "+totalValue);
		
	}

	
	
	
	
}

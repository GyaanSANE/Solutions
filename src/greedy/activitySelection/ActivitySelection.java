package greedy.activitySelection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {
	ArrayList<Activity> actList; //= new ArrayList<>();
	
	static Comparator<Activity> comparator = new Comparator<Activity>() {
		@Override
		public int compare(Activity a, Activity b) {
			return (a.getEnd() - b.getEnd());
		}
	};

	public static void select(ArrayList<Activity> actList) {
		Collections.sort(actList,comparator);
		int busy=-1;
		int count=0;
		for(Activity act :actList) {
			if(busy < act.getStart()) {
				System.out.println("Taken "+act);
				busy = act.getEnd();
				count++;
			}
		}
		System.out.println("Total activities done = "+count);
	}
}

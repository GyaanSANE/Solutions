package greedy.activitySelection;

public class Activity {
	private int start;
	private int end;
	private String name;
	public Activity(String name, int start,int end) {
		this.name = name;
		this.start = start;
		this.end = end;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ("Activity: "+name+" ("+start+","+end+")");
	}

}

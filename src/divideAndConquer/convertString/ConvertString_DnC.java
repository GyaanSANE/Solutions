package divideAndConquer.convertString;

public class ConvertString_DnC {
	//find min number of operations (insert/delete/replace - character) required to convert string B into String A
	public int convert(String s1,String s2) {
		return check(s1,s2,0,0);
	}

	private int check(String s1, String s2, int i, int j) {
		if(s1.length()<=i && s2.length()<=j) {
			return 0;
		}else if(s1.length()<=i || s2.length()<=j) {
			return (s1.length()<=i ? s2.length()-j : s1.length()-i);  //if one string is over, return number of chars left in the other	
		}
		
		if(s1.charAt(i) == s2.charAt(j)) {
			return check(s1,s2,i+1,j+1);
		}else {
			int c1 = 1+ check(s1,s2,i+1,j);		//insert
			int c2 = 1+ check(s1,s2,i,j+1);		//delete
			int c3 = 1+ check(s1,s2,i+1,j+1);	//replace
			return(Math.min(c1, Math.min(c2, c3)));
		}
	}

	
	public static void main(String[] args) {
		ConvertString_DnC editCost = new ConvertString_DnC();
		System.out.println(editCost.convert("table", "tbres"));
		System.out.println(editCost.convert("abcd", "ab"));

	}
}

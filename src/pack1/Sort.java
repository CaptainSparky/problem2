package pack1;

public class Sort {
 int[] digits;
 
	public Sort(int i) {
		int length = String.valueOf(i).length();
		digits = new int[length-1];
		fill(i, length);
	}


	private void fill(int i, int length) {
		
		String temp = Integer.toString(i);
		for (int inc = 0; inc < length-1;){
			digits[inc] = temp.charAt(inc);
		}
		
	}


	public int convert() {
		
		
		
		return 0;
	}

}

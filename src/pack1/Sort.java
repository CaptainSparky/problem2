package pack1;

public class Sort {
 int[] digits;
 int length;
 
	public Sort(String input) {
		length = String.valueOf(input).length();
		length = length-1;
		digits = new int[length];
		fill(input, length);
	}


	private void fill(String input, int length) {
		
		
		for (int inc = 0; inc < length-1;){
			digits[inc] = input.charAt(inc);
		}
		
	}
	

	public int convert() {
		int ans = firstlast();
		int compare1 = 0;
		int compare2 = 1;
		while (compare2 <= length){
		if (digits[compare1] == digits[compare2] ){
			ans = ans + digits[compare1];
		}
		compare1++;
		compare2++;
		}
		return ans;
	}


	private int firstlast() {
		if (digits[0] == digits[length]){
			return digits[0];
		}else{
			return 0;
		}
		
	}

}

package pack1;

import org.junit.Test;
 
public class Test {
	@Test
	public void testsetup() {
		Sort sortsetup = new Sort(1122);
		assert (sortsetup.digits[0] == 1);
		assert (sortsetup.digits[1] == 1);
		assert (sortsetup.digits[2] == 2);
		assert (sortsetup.digits[3] == 2);
		Sort sortsetup2 = new Sort(987605321);
		assert (sortsetup.digits[0] == 9);
		assert (sortsetup.digits[1] == 8);
		assert (sortsetup.digits[2] == 7);
		assert (sortsetup.digits[3] == 6);
		assert (sortsetup.digits[4] == 0);
		assert (sortsetup.digits[5] == 5);
		assert (sortsetup.digits[6] == 3);
		assert (sortsetup.digits[7] == 2);
		assert (sortsetup.digits[8] == 1);

	}
	
	@Test
	public void testTwoSet() {
		Sort sortTwoSet = new Sort(1122);
		assert (sortTwoSet.convert == 3);
		
	}
	@Test
	public void testFourOfType() {
		Sort sortFourOfType = new Sort(1111);
		assert (sortFourOfType.convert == 2);
		
	}
	@Test
	public void testNoMatch() {
		Sort sortNoMatch = new Sort(1234);
		assert (sortNoMatch.convert == 0);
		
	}
	@Test
	public void testStartToEnd() {
		Sort sortStartToEnd = new Sort(91212129);
		assert (sortStartToEnd.convert == 9);
		
	}
}

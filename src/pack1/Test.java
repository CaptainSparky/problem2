package pack1;

import org.junit.Test;
 
public class Test {
	@Test
	public void testTwoSet() {
		Sort sortTwoSet = new Sort(1122);
		assert (sortTwoSet.convert == 1122);
		
	}
	@Test
	public void testFourOfType() {
		Sort sortFourOfType = new Sort(1111);
		assert (sortFourOfType.convert == 1111);
		
	}
	@Test
	public void testNoMatch() {
		Sort sortNoMatch = new Sort(1234);
		assert (sortNoMatch.convert == 1234);
		
	}
	@Test
	public void testStartToEnd() {
		Sort sortStartToEnd = new Sort(91212129);
		assert (sortStartToEnd.convert == 91212129);
		
	}
}

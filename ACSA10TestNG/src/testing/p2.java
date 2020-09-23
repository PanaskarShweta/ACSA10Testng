package testing;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class p2 {
	@Test
	public void banana() {
		Reporter.log("from banana");
	}
	@Test
public void apple() {
	Reporter.log("from apple");
}
	@Test
	public void grape() {
		Reporter.log("from grape");
	}
}

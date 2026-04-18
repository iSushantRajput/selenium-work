package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_extra.List_imp.class)
public class JustToProve001 {
	@Test
	public void case1() {
		Assert.assertTrue(false);
	}
}

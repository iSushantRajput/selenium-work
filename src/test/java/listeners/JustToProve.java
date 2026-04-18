package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_extra.List_imp.class)
public class JustToProve {
	@Test
	private void case3() {
		Assert.assertTrue(false);
	}
	
	@Test
	private void case31() {
		Assert.assertTrue(true);
	}
}

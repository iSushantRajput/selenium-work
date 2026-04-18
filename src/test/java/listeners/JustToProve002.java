package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listeners_extra.List_imp.class)
public class JustToProve002 {
	@Test
	private void case2() {
	Assert.assertTrue(true);
	}
}

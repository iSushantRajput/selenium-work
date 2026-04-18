package listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import listeners_extra.List_imp;



@Listeners(listeners_extra.List_imp.class)
public class Just_To_Prove {
	
	@Test
	private void genRep() throws InterruptedException {
		Assert.assertTrue(false);
		Thread.sleep(1500);
	}
	
	@Test
	private void genRep1() throws InterruptedException {
		Assert.assertTrue(true);
		Thread.sleep(1500);
	}
	
	@Test(dependsOnMethods = "genRep")
	private void genRep2() throws InterruptedException {
		Thread.sleep(1500);
		
	}
}

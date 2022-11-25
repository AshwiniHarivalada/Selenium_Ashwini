package Day3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test(dependsOnMethods="logOutFromApplication")
	public void login()
	{
		Assert.assertTrue(false);
		System.out.println("Login");
	}
	@Test(dependsOnMethods="login")
	public void logOutFromApplication()
	{
		System.out.println("Logout");
	}

}

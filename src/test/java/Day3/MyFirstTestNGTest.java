package Day3;

import org.testng.annotations.Test;

public class MyFirstTestNGTest {
	@Test(priority=2)
	public void test1()
	{
		System.out.println("Test 1 Executed");
	}
	@Test

	public void createaccount()
	{
		System.out.println("Account Created");
	}
	@Test
	public void deleteAccount()
	{
		System.out.println("Account Deleted");
	}
	@Test(priority=1)
	public void logOutFromApplication()
	{
		System.out.println("Logout Done");
	}
	



}

package Pac1;

import org.testng.annotations.Test;

public class OrgTest {

	@Test
	public void createOrgTest()
	{
		String url=System.getProperty("url");
		String browser=System.getProperty("browser");
		String username=System.getProperty("username");
		String password=System.getProperty("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);

	   System.out.println("create org test");
	}
	@Test
	public void modifyOrgTest()
	{
	   System.out.println("modify org test");
	}
	
}

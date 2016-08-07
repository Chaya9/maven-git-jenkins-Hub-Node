//Day12   7/8/2016
//This maven project is associated with git,jenkin, and remote system nodes

package mypackage1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DemoB {
	@Test
	public void testA(){
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("mavenproject-git-jenkins-H&N");
		driver.close();
		
	}
}

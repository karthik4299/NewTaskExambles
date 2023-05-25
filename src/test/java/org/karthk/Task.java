package org.karthk;

import org.baseclass.BaseClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task extends BaseClass {

	@BeforeClass
	public static  void browserlaumch() {
      browserlaunch("edge");
      maximize();
      implicityWait(10);
      urlLaunch("https://www.facebook.com/");
      
	}
@Test
public  void login() {
   WebElement mail = driver.findElement(By.id("email"));
   sendkeys(mail, "karthik");
   WebElement pass = driver.findElement(By.id("pass"));
   sendkeys(pass, "1111111");
   WebElement login = driver.findElement(By.name("login"));
   click(login);
   System.err.println("dfghjkl");
   System.out.println("dfghjk");
   
   
   System.out.println("oooooooooo");
}
	
	
	
	
}

package testcases;

import base.TestBase;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

@Test(dataProvider= "getData")
    public void login(String email) throws InterruptedException {
    log.debug("Inside LoginTest");
    driver.findElement(By.cssSelector(OR.getProperty("BmlBtn"))).click();
    Thread.sleep(3000);

}

@DataProvider
    public Object [][] getData () {

}

}

package Run;

import org.testng.annotations.Test;

import Com.pages.Home;
import Common.browsers;

public class Forgot_psswd extends browsers {
  @Test
  public void f() {
	  Home h= new Home(driver);
		h.Emailidfield("Zoha.kharazmi@yahoo.com");
		h.psswordfield("zk");
		h.loginbt();
		driver.navigate().back();
  }
}

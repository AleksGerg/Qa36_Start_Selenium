import org.checkerframework.framework.qual.DefaultQualifier;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Login {
    WebDriver wd;

    @BeforeMethod
    public void preCond() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app");
    }

  /* @Test
   public void findElemOnPage(){
      //by tag name
      WebElement element = wd.findElement(By.tagName("div"));
      List<WebElement> divs = wd.findElements(By.tagName("div"));

      //by id
      WebElement el1 = wd.findElement(By.id("root"));

      // By class
      WebElement el2 = wd.findElement(By.className("container"));

      //By name
    //  wd.findElement(By.name("name"));

      //By link text a href
      wd.findElement(By.linkText("HOME"));
      wd.findElement(By.partialLinkText("HO"));
   }*/

    @Test
    public void loginSuccess() {
        WebElement itemlogin = wd.findElement(By.linkText("LOGIN"));
        itemlogin.click();

        WebElement email = wd.findElement(By.name("email"));
        email.click();
        email.clear();
        email.sendKeys("noa@gmail.com");

        WebElement password = wd.findElement(By.name("password"));
        password.click();
        password.clear();
        password.sendKeys("Nnoa12345$");

        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        WebElement buttonLogin = buttons.get(0);
        buttonLogin.click();

    }

    @Test
    public void registrationSuccess() {
        WebElement reg = wd.findElement(By.linkText("LOGIN"));
        reg.click();

        WebElement emailForReg = wd.findElement(By.name("email"));
        emailForReg.click();
        emailForReg.clear();
        emailForReg.sendKeys("benb@gmail.com");

        WebElement passwordForReg = wd.findElement(By.name("password"));
        passwordForReg.click();
        passwordForReg.clear();
        passwordForReg.sendKeys("Beny$123456");

        List<WebElement> button = wd.findElements(By.tagName("button"));
        WebElement but = button.get(1);
        but.click();

    }

    @Test
    public void registrationSuccess2() {
        WebElement reg2 = wd.findElement(By.linkText("LOGIN"));
        reg2.click();

        WebElement emailForReg2 = wd.findElement(By.name("email"));
        emailForReg2.click();
        emailForReg2.clear();
        emailForReg2.sendKeys("ili@gmail.com");

        WebElement passwordForReg2 = wd.findElement(By.name("password"));
        passwordForReg2.click();
        passwordForReg2.clear();
        passwordForReg2.sendKeys("IliB$123456");


        List<WebElement> button = wd.findElements(By.tagName("button"));
        button.get(1).click();


    }

    @Test
    public void ccslocatrstest() {

        wd.findElement(By.linkText("LOGIN")).click();

        wd.findElement(By.tagName("div"));
        wd.findElement(By.cssSelector("div#root"));//id

        wd.findElements(By.cssSelector("div.container"));//class
        wd.findElement((By.cssSelector(".navbar-component_nav__1X_4m")));//class
        wd.findElement(By.cssSelector(".login_login__3EHKB"));// class

        wd.findElement((By.cssSelector("div :last-of-type")));//finding the inscription PHONEBOOK

        wd.findElement((By.cssSelector("input[placeholder^='Pass']")));
        wd.findElement((By.cssSelector("input[placeholder*='ass']")));
        wd.findElement((By.cssSelector("input[placeholder$='ord']")));


        wd.findElement(By.cssSelector("a[href='/login']"));
        wd.findElement(By.cssSelector("input[name='email']"));
        wd.findElement((By.cssSelector("button[name='login']")));
        wd.findElement(By.cssSelector("form :last-child"));
        
    }

    @AfterMethod
    public void postCondition() {
        // close browser
        wd.quit();

    }
}

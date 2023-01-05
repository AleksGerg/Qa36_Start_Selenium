import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TrelloWeb {
    WebDriver wd;

    @BeforeMethod
    public void preConditshions(){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/%22");

    }

    @Test
    public void trello(){
        WebElement loginButton = wd.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();
        WebElement emailField = wd.findElement(By.cssSelector("#user"));
        emailField.click();
        emailField.clear();
        emailField.sendKeys("gergelaleksandra@gmail.com");

        WebElement logButton = wd.findElement(By.cssSelector("#login"));
        loginButton.click();

        WebElement passwordInput = wd.findElement(By.cssSelector("#password"));
        passwordInput.click();
        passwordInput.clear();
        passwordInput.sendKeys("12345.com");


    }

}

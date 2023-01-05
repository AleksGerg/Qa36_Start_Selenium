import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Index {
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/Aleksandra/Downloads/index.html");
        //  wd.manage().window().maximize();
    }

    @Test
    public void tableTest() {
        //check the table have 4 lins
        List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        Assert.assertEquals(rows.size(), 4);

       // wd.findElements(By.xpath("//tr"));



        //check that table have "Mexico"
        WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        //wd.findElement(By.xpath("//tr[last()]"));
        System.out.println(lastRow.getText());//Poland Chine Mexico


        Assert.assertTrue(lastRow.getText().contains("Mexico"));

        WebElement lastCell = wd.findElement((By.cssSelector("tr:last-child td:last-child")));
        wd.findElement(By.xpath("//tr[last()]//td[last()]"));
        System.out.println(lastCell.getText());
       // Assert.assertTrue(lastCell.getText().contains("Mexico"));

        //print Mariya Anders
        System.out.println(wd.findElement(By.cssSelector("tr:nth-child(2 td:nth-child(2))")));
        wd.findElement(By.xpath("//tr[2]//td[2]"));

    }

    @Test
    public void itemTestHW() {
        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        item1.click();
        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        String textAlert = alert.getText();
        Assert.assertTrue(textAlert.contains("Clicked by Item 1"));

        WebElement item3 = wd.findElement(By.cssSelector("[href = '#item3']"));
        item3.click();
        textAlert = alert.getText();
        Assert.assertTrue((textAlert.contains("Clicked by Item 3")));
    }

    @Test
    public void formTestHW() {
        WebElement elementName = wd.findElement(By.cssSelector("[name='name']"));
        elementName.clear();
        elementName.click();
        elementName.sendKeys("Joe");


        WebElement elementSurname = wd.findElement(By.cssSelector("[name='surename']"));
        elementSurname.clear();
        elementSurname.click();
        elementSurname.sendKeys("Bo");

        WebElement send = wd.findElement(By.cssSelector(".btn"));
        send.click();

        System.out.println(elementName.getText()+"@@@" );// it doesn't print! Why?

        WebElement alert = wd.findElement(By.cssSelector("#alert"));
        String alertText = alert.getText();
        Assert.assertTrue(alertText.contains(elementName.getText() + elementSurname.getText()));

    }




  // @AfterMethod
   // public void close() {
     //   wd.quit();
    //}
}

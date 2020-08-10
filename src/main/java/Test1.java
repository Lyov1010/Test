import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import org.sikuli.script.App;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Test1
{
   public static void main(String[] args) throws InterruptedException, FindFailed {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\Owner\\Desktop\\chromedriver\\chromedriver.exe"); //Please change the path
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();

       driver.get("http://104.248.248.105:8085/");
       WebElement buttons= driver.findElement(By.tagName("button"));
       buttons.click();
       Actions builder=new Actions(driver);
       Thread.sleep(4000);

       WebElement canvas = driver.findElement(By.cssSelector("#KeyLines-chart-1"));
       builder.moveToElement(canvas);
       builder.contextClick(canvas).build().perform();  // this will perform right click */
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("li")).click(); //First PopUp --1
       Thread.sleep(1000);
       driver.switchTo().alert().accept();//Alert ok click
       driver.findElements(By.cssSelector("li")).get(1).click();// --2   naev kara lini orinak senc vekalel  -->  (By.cssSelector("li:nth-child(2)");
       Thread.sleep(1000);
       driver.switchTo().alert().accept();
       driver.findElements(By.cssSelector("li")).get(2).click();
       Thread.sleep(1000);
       driver.switchTo().alert().accept();
       Action CLickNode1=builder.moveToElement(canvas).doubleClick().build();
       CLickNode1.perform();

       Screen s=new Screen();
       Pattern node2=new Pattern("C:\\Users\\Owner\\IdeaProjects\\Test\\beautiful\\node2.png");
       Pattern node3=new Pattern("C:\\Users\\Owner\\IdeaProjects\\Test\\beautiful\\node3.png");
       Thread.sleep(2000);
       s.doubleClick(node2);
       Thread.sleep(2000);
       s.doubleClick(node3);


    }
}

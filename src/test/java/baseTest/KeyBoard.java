package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class KeyBoard {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Way2Automation");
        Actions action = new Actions(driver);
//        action.sendKeys(Keys.ENTER).perform();
//        System.out.println(driver.findElement(By.xpath("//input[@name='q']")).getText());
        driver.findElement(By.xpath("//body[@id='gsr']/div[@id='viewport']/div[@id='searchform']/form[@id='tsf']/div[2]")).click();
        action.sendKeys(Keys.chord(Keys.CONTROL+"a")).perform();
        Thread.sleep(2000);
        action.sendKeys(Keys.chord(Keys.CONTROL+"c")).perform();
        driver.findElement(By.xpath("//input[@name='q']")).click();
        action.sendKeys(Keys.chord(Keys.CONTROL+"v")).perform();
        Thread.sleep(2000);



        driver.quit();
    }
}

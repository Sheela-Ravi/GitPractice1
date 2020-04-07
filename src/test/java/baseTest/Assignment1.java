package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Assignment1 {

    public static WebDriver driver;
    public String browser= "chrome";

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Way2Automation");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"tsf\"]//ul/li[1]/div/div[2]/div/span")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div[1]/a/h3")).click();
        Thread.sleep(3000);
        WebElement block = driver.findElement(By.xpath("//*[@id=\"wrapper\"]"));
        List<WebElement> links = block.findElements(By.tagName("a"));
        System.out.println("Number of Links: "+links.size());
        for(int i=0; i<links.size();i++){
            System.out.println(links.get(i).getText()+"--URL is: "+ links.get(i).getAttribute("href"));
        }

        driver.quit();
    }



}

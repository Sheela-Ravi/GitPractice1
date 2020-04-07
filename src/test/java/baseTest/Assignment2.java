package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment2 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://qa.way2automation.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@name=\"name\"]")).sendKeys("Sheela Ravi");
        driver.findElement(By.name("country")).sendKeys("Greece");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@id='load_box']//input[@class='button']")).click();
        Thread.sleep(2000);

        driver.quit();

    }

}

package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment3 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://timesofindia.indiatimes.com/poll.cms");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        String[] a = driver.findElement(By.xpath("//*[@id=\"mathq2\"]")).getText().split(" ");
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[2]);
        int result = 0;
        switch (a[1]) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
        }
        System.out.println("result: " + result);
        driver.findElement(By.xpath("//input[@id='mathuserans2']")).sendKeys(Integer.toString(result));

        driver.quit();
    }
}


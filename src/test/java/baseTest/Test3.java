package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test3 {
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebElement dd = driver.findElement(By.id("searchLanguage"));
//        Select select = new Select(dd);
//        select.selectByVisibleText("Dansk");
//        Thread.sleep(3000);
//        select.selectByValue("bg");
//        Thread.sleep(3000);
//
//        List<WebElement> values = driver.findElements(By.tagName("option"));
//        System.out.println(values.get(4).getText());
//        System.out.println("Total: " + values.size());
//        for (int i = 0; i < values.size(); i++) {
//            System.out.println(values.get(i).getText());
//        }
//
//        List<WebElement> links = driver.findElements(By.tagName("a"));
//        System.out.println("Total links: "+ links.size() );
//
//        WebElement block = driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/div[6]/div[3]"));
//        List<WebElement> links2 =block.findElements(By.tagName("a"));
//
//
//        System.out.println("Total links: "+ links2.size() );
//
//        for (int i = 0; i < links2.size(); i++) {
//            System.out.println(links2.get(i).getText()+"---URL is: "+ links2.get(i).getAttribute("href"));
//    }

            System.out.println(driver.findElement(By.xpath("//*[@id=\"www-wikipedia-org\"]/h1/div/div")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/small/span")).isEnabled());
        driver.findElement(By.xpath("//*[@id=\"js-link-box-en\"]/strong")).click();
        Thread.sleep(3000);
        System.out.println(driver.findElement(By.xpath("//*[@id=\"pt-anonuserpage\"]")).isEnabled());


        driver.quit();

    }
}

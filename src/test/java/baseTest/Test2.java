package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Test2 {


    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.ig.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement createLA = driver.findElement(By.xpath("//*[@id=\"account-controls\"]/div[1]/ul/li[2]/a"));
        createLA.click();
        String title = driver.getTitle();
        System.out.println(title);
        WebDriverWait wait = new WebDriverWait(driver,10);
//        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/div")));
//        String pageTitle = driver.findElement(By.xpath("//*[@id=\"desktop-page1\"]/fieldset[1]/h1")).getText();
//        System.out.println(pageTitle);

//        WebElement corDD = driver.findElement(By.xpath("//select[@name='countryOfResidence']"));
//        Select select = new Select(corDD);
//        select.selectByVisibleText("Togo");

        driver.quit();


    }
}

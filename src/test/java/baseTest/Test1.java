package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;

public class Test1 {


    public static String br = "chrome";
    public static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {


        if (br.equals("chrome")) {

            WebDriverManager.chromedriver().setup();
             driver = new ChromeDriver();
            driver.get("https://www.ig.com");
        } else {

            WebDriverManager.iedriver().setup();
             driver = new InternetExplorerDriver();
            driver.get("https://www.ig.com");

        }
//        Thread.sleep(3000);
        driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        WebDriverWait wait = new WebDriverWait(driver,5);

        try {
            driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("pandikanda.sheel@gmail.com");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("couldn't find the element");
        }
        driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("aaa");
        driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span")).click();
        driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[1]/div[2]/div[2]/span")).getText();


    }

}


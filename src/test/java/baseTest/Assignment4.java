package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        WebDriver.Window window = driver.manage().window();
        int x = 40;
        int y = 50;
        while (x < 900) {
            window.setSize(new Dimension(x, y));
            Thread.sleep(1000);
            x += 10;
            y += 10;



        }

    }
}

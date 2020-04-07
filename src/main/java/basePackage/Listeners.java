package basePackage;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Listeners implements ITestListener {
    public WebDriver driver;

    public void onTestStart(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult result) {


        System.out.println("Passed Test - " + result.getName());

    }

    public void onTestFailure(ITestResult result) {

        System.out.println("Screenshot on failure");

//        this.driver = ((baseTest.DragnDrop) result.getInstance()).driver;
//
//        String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File source = ts.getScreenshotAs(OutputType.FILE);
////        String methodName=result.getName().toString().trim();
//
//        String destination = System.getProperty("user.dir") + "/screenshots/" + "Screenshot" + dateName + ".png";
//        File finalDestination = new File(destination);
//        try {
//            Files.copy(source, finalDestination);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


    }

    public void onTestSkipped(ITestResult result) {
        // TODO Auto-generated method stub
        System.out.println("");
        System.out.println("Test skipped");

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // TODO Auto-generated method stub

    }

    public void onStart(ITestContext context) {
        // TODO Auto-generated method stub
        System.out.println("On starrt listener");

    }

    public void onFinish(ITestContext context) {
        // TODO Auto-generated method stub
        System.out.println("Onfinish listener method");

    }
}

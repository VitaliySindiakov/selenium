package Selenium.core;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vitaliy on 10.05.2018.
 */
public class TestListener implements ITestListener{
    private WebDriver webDriver;
    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
       webDriver  = ((WebDriverTestBase)iTestResult.getInstance()).webDriver;
       saveScreenshot(iTestResult.getMethod().getQualifiedName());
//        File scrFile = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
//        try {
//            FileUtils.copyFile(scrFile,
//                    new File("c:\\failed\\" + (iTestResult.getMethod().getQualifiedName()+".png")));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    private void setSaveScreenshot(String qualifiedName) {
    }

    @Attachment
            (value = "{0}", type = "image/png")
    public byte[] saveScreenshot(String attachName){
        return ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.BYTES);
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}

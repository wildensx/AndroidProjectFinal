package prueba1;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Reloj{
    AppiumDriver mobile;

    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities config = new DesiredCapabilities();
        config.setCapability("deviceName", "proy");
        config.setCapability("platformVersion", "9.0");
        config.setCapability("appPackage", "com.google.android.deskclock");
        config.setCapability("appActivity", "com.android.deskclock.DeskClock");
        config.setCapability("platformName", "Android");
        config.setCapability("automationName", "uiautomator2");
        this.mobile = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), config);
        mobile.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void verifySomething() throws InterruptedException {
        //click
        mobile.findElement(By.xpath("//android.widget.TextView[@text='ALARM']")).click();
        //click
        mobile.findElement(By.id("com.google.android.deskclock:id/fab")).click();
        //click
        mobile.findElement(By.id("android:id/radial_picker")).click();
        //click
        mobile.findElement(By.id("android:id/pm_label")).click();
        //click

        mobile.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\'6\']")).click();

        mobile.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\'0\']")).click();
        mobile.findElement(By.id("android:id/button1")).click();
        //click
        mobile.findElement(By.id("com.google.android.deskclock:id/edit_label")).click();
        //
        mobile.findElement(By.xpath("//android.widget.EditText")).sendKeys("Proy_Auto2_2023");
        //
        mobile.findElement(By.id("android:id/button1")).click();

        Thread.sleep(3000);
    }

    @AfterEach
    public void closeApp() {
        this.mobile.quit();
    }
}

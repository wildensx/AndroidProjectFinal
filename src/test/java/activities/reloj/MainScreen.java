package activities.reloj;

import control.Label;
import org.openqa.selenium.By;

public class MainScreen {
    public Label alarmLabel = new Label(By.xpath(
            "//android.widget.HorizontalScrollView/..//android.widget.TextView[@text=\'ALARM\']"));


}

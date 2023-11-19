package activities.reloj;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;


public class ConfigAlarmScreen {

    public TextBox alarmBox = new TextBox(By.id("android:id/radial_picker"));
    public Button textAlarmButton = new Button(By.id("android:id/toggle_mode"));
    public TextBox hourText = new TextBox(By.xpath("//android.widget.TextView/..//android.widget.EditText[@resource-id='android:id/input_hour']"));
    public TextBox minuteText = new TextBox(By.xpath("//android.widget.TextView/..//android.widget.EditText[@resource-id='android:id/input_minute']"));
    public Button saveButton = new Button(By.id("android:id/button1"));

}

package activities.reloj;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class AlarmScreen {

    public Button addButton = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Add alarm\"]"));
    public Button addnameButton = new Button(By.id("com.google.android.deskclock:id/edit_label"));
    public TextBox nameAlarmText = new TextBox(By.xpath("//android.widget.EditText"));
    public Button okButton = new Button(By.id("android:id/button1"));




}
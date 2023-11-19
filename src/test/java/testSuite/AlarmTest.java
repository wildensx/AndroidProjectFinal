package testSuite;

import activities.reloj.AlarmScreen;
import activities.reloj.ConfigAlarmScreen;
import activities.reloj.MainScreen;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import session.Session;

public class AlarmTest {
    MainScreen mainScreen = new MainScreen();
    AlarmScreen alarmScreen = new AlarmScreen();
    ConfigAlarmScreen configAlarmScreen = new ConfigAlarmScreen();

    @Test
    public void createAlarmTest() throws InterruptedException{
        String title="NewAlarmUCBTest";
        mainScreen.alarmLabel.click();
        alarmScreen.addButton.click();
        configAlarmScreen.alarmBox.click();
        configAlarmScreen.textAlarmButton.click();
        configAlarmScreen.hourText.clearText("12");
        configAlarmScreen.minuteText.clearText("12");
        configAlarmScreen.saveButton.click();
        alarmScreen.addnameButton.click();
        alarmScreen.nameAlarmText.setText(title);
        alarmScreen.okButton.click();
        //Asserts:

        String actualTitle = alarmScreen.addnameButton.getText();
        Assertions.assertEquals(title, actualTitle,
                "El título de la alarma no coincide con el esperado");

        Assertions.assertTrue(alarmScreen.addnameButton.isControlDisplayed(),
                "La alarma no fue creada");

    }

    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }
}

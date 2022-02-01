package context_menu;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTest {

    @Test
    public void getTextFromTriggeredAlert(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.setInternetBoxAlertTrigger();
        String text = contextMenuPage.alert_getText();
        assertEquals(text,"You selected a context menu","Incorrect text");
    }
}

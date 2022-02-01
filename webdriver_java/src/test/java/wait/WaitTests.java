package wait;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTest {

    @Test
    public  void testWaitUntilHidden(){
        var loadingPage = homePage.clickDynamicLoading().clickExample1();
        loadingPage.clickStart();
        String loadedText = loadingPage.getLoadedText();
        assertEquals(loadedText,"Hello World!","loaded text is incorrect");
    }
}

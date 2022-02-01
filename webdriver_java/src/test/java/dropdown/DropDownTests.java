package dropdown;

import base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTest {

    @Test
    public void testSelectOption(){
        var dropDownPage = homePage.clickDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        System.out.println("The selected option count is : " + selectedOptions.stream().count());
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");


    }
}

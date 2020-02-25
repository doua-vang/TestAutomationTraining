package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testSelectOption(){
        String option = "Option 1";
        var dropDownPage = homePage.clickDropDownLink();
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOption();
        assertEquals(selectedOptions.size(), 2, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");




    }
}

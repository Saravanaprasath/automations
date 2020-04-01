package com.testleaf.brushup.testcases;

import com.testleaf.brushup.base.TestBase;
import com.testleaf.brushup.functions.Edit;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class EditTest extends TestBase {

    Edit editPage;

    public EditTest() {
        super();
        editPage = PageFactory.initElements(driver, Edit.class);
    }

    @Test
    public void openEditPage() {
        editPage.OpenEdit();
    }
}

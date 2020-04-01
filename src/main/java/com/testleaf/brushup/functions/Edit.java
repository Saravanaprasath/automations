package com.testleaf.brushup.functions;

import com.testleaf.brushup.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Edit extends TestBase {
    public Edit(WebDriver driver) {
        super();
        this.driver = driver;
    }

    //X-Paths
    @FindBy(xpath = "//a[contains(@href,'Edit.html')]")
    WebElement edit;

    //Methods
    public void OpenEdit(){
        edit.click();
    }

    public void enterText(){

    }

    public void appendText(){

    }


}

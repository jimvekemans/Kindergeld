package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverProvider;

@SuppressWarnings("FieldCanBeLocal")
public abstract class AbstractPage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    AbstractPage() {
        this.initElements();
    }

    protected void initElements() {
        this.driver = DriverProvider.getDriver();
        this.wait = new WebDriverWait(driver, 30);
        this.waitForPageLoad();
        PageFactory.initElements(driver, this);
    }

    private void waitForPageLoad() {
        wait.until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
}


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class NotebooksPage extends BasePage{
    private static final String MIN_PRICE = "5000";
    private static final String MAX_PRICE = "30000";

    @FindBy(xpath = "//input[@formcontrolname='min']")
    WebElement minPriceField;

    @FindBy(xpath = "//input[@formcontrolname='max']")
    WebElement maxPriceField;

    @FindBy(xpath = "//fieldset//button[@type='submit']")
    WebElement submitButton;

    public NotebooksPage(WebDriver driver) {
        super(driver);
    }

    public NotebooksPage enterMinPrice(){
        waitToElementBecomeVisible(minPriceField);
        Actions actions = new Actions(driver);
        actions.scrollToElement(minPriceField).perform();
        minPriceField.clear();
        minPriceField.sendKeys(MIN_PRICE);
        return this;
    }
    public NotebooksPage enterMaxPrice(){
        maxPriceField.clear();
        maxPriceField.sendKeys(MAX_PRICE);
        return this;
    }
    public RangedByPicePage enterConfirmButton(){
    waitToElementBecomeClickable(submitButton);
    submitButton.click();
    return new RangedByPicePage(driver);
    }
}

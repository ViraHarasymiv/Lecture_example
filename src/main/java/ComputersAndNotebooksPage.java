import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComputersAndNotebooksPage extends BasePage{

    @FindBy(xpath = "//a[contains(@class, 'tile-cats__h')][@title='Ноутбуки']")
    WebElement notebooksCategory;

    public ComputersAndNotebooksPage(WebDriver driver) {
        super(driver);
    }

    public NotebooksPage clickOnNotebooksCategory(){
        waitToElementBecomeVisible(notebooksCategory);
        notebooksCategory.click();
        return new NotebooksPage(driver);
    }
}

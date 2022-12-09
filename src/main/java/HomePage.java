import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//button[contains(text(), 'Каталог')]")
    WebElement catalogButton;

    @FindBy(xpath = "//li[contains(@class, 'menu-categories__item m')]/a[contains(@href, 'c80253/')]")
    WebElement notebooksAndComputersButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnCatalogButton(){
        catalogButton.click();
        return this;
    }
    public ComputersAndNotebooksPage clickOnNotebooksAndComputersButton(){
        notebooksAndComputersButton.click();
        return new ComputersAndNotebooksPage(driver);
    }
}

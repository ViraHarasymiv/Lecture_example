import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RangedByPicePage extends BasePage{
    private static final String URL = "https://rozetka.com.ua/ua/notebooks/c80004/price=5000-30000/";

    @FindBy(xpath = "//span[contains(@class, 'price-value')]")
    List<WebElement> products;

    public RangedByPicePage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getProducts(){
        waitToURLToBe(URL);
        return products;
    }

}

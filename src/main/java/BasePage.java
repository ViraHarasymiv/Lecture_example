import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class BasePage {
    private static final int TIMEOUT = 30;

    protected WebDriver driver;
    private WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
        PageFactory.initElements(driver,this);
    }
    public void waitToElementBecomeClickable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    public void waitOfVisibilityOfAllElements(List<WebElement> elements){
        wait.until(ExpectedConditions.invisibilityOfAllElements(elements));
    }
    public void waitToElementBecomeVisible(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }
    public void waitToURLToBe(String url){
        wait.until(ExpectedConditions.urlToBe(url));
    }
}

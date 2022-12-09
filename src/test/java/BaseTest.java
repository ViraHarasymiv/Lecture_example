import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;
    private static final String ROZETKA_URL = "https://rozetka.com.ua/ua/";

    @BeforeTest
    public void beforeSuite(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ROZETKA_URL);
    }

    @AfterMethod
    public void afterSuite(){
        if(driver != null){
            driver.quit();
        }
    }
}

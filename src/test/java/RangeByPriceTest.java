import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class RangeByPriceTest extends BaseTest{
    private static final int MIN_PRICE  = 5000;
    private static final int MAX_PRICE  = 30000;

    @Test
    public void checkRangedPrices(){
        List<WebElement> actualResults = new HomePage(driver)
                .clickOnCatalogButton()
                .clickOnNotebooksAndComputersButton()
                .clickOnNotebooksCategory()
                .enterMinPrice()
                .enterMaxPrice()
                .enterConfirmButton()
                .getProducts();
        Assert.assertTrue(actualResults
                .stream()
                .map(webelement -> webelement.getText().replaceAll(" ", ""))
                .map(web -> Integer.parseInt(web))
                .allMatch(price -> price >= MIN_PRICE && price <= MAX_PRICE));
    }
}

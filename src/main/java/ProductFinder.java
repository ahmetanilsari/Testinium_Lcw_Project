import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

import static org.openqa.selenium.By.id;

public class ProductFinder {
    WebDriver driver;
    public ProductFinder(WebDriver driver) {
        this.driver = driver;
    }

    public void productSearch() {
        try {
            //driver.findElement(By.xpath("//input[@id='search_input']")).sendKeys("pantolon");
            driver.findElement(By.className("searchBox")).click();
            Thread.sleep(1000);
            driver.findElement(By.className("searchBox")).sendKeys("pantolon");
            Thread.sleep(2000);
            driver.findElement(By.className("searchButton")).click();
            Thread.sleep(1000);
            driver.findElement(By.className("lazy-load-text")).click();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
    List<WebElement> allProducts;
    public void randomProduct(){
        try {
            allProducts = driver.findElements(By.className("col-sm-12"));
            Thread.sleep(500);
            Random random = new Random();
            int randomProduct = random.nextInt(allProducts.size());
            allProducts.get(randomProduct).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }


}

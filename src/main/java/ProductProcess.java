import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class ProductProcess {
    WebDriver driver;
    public ProductProcess(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement> allSize;
    public void addToProduct(){
        try {
            driver.findElement(By.id("option-size")).click();
            Thread.sleep(1000);
            Random random = new Random();
            int addToProduct = random.nextInt(allSize.size());
            allSize.get(addToProduct).click();
            driver.findElement(By.id("pd_add_to_cart")).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }

    }

    public void price() {
        try {
            driver.findElement(By.xpath("//*[@class='rd-cart-item-price mb-15']")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    public void increase(){
        try {
            driver.findElement(By.xpath("//*[@value='2']")).click();
            Thread.sleep(1000);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void deleteProduct(){
        try {
            driver.findElement(By.xpath("//*[@title='Sil']")).click();
            Thread.sleep(1000);
            Assert.assertNotNull(By.xpath("//*[@title='Sil']"));
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

}

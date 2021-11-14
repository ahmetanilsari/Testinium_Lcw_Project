import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ecommerce {

    ProductFinder productFinder;
    ProductProcess productProcess;
    WebDriver driver;

    public void start() {
        System.setProperty("webdriver.chrome.driver", "D:/Selenium/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        productFinder = new ProductFinder(driver);
        productProcess = new ProductProcess(driver);
        driver.get("https://www.lcwaikiki.com/tr-TR/TR");
        driver.manage().window().maximize();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.lcwaikiki.com/tr-TR/TR");
    }


    public void LoginPage(){
        try{
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@class='dropdown-toggle']")).click();
            Thread.sleep(2000);
            driver.findElement(By.id("inputEmailDiv")).click();

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }

    public void login(){
        try {
            driver.findElement(By.id("LoginEmail")).sendKeys("ahmetsari1303@gmail.com");
            driver.findElement(By.id("Password")).sendKeys("A123123");
            driver.findElement(By.xpath("//*[@class='button bc-blue login-button-link bold']")).click();
            Thread.sleep(1000);

        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.lcwaikiki.com/tr-TR/TR");
    }

    public void productSearch(){
        productFinder.productSearch();
    }


    public void randomProduct(){
        productFinder.randomProduct();
    }
    public void addToProduct(){

        productProcess.addToProduct();
    }
    public void finder(){
        productProcess.price();
    }


    public void increase(){
        productProcess.increase();
    }

    public void delete(){
        productProcess.deleteProduct();
    }
}

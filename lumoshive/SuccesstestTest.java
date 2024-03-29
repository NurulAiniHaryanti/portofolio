// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SuccesstestTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void successtest() {
    // Test name: successtest
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("https://demo.midtrans.com/");
    // 2 | setWindowSize | 711x728 | 
    driver.manage().window().setSize(new Dimension(711, 728));
    // 3 | click | linkText=BUY NOW | 
    driver.findElement(By.linkText("BUY NOW")).click();
    // 4 | click | css=.cart-checkout | 
    driver.findElement(By.cssSelector(".cart-checkout")).click();
    // 5 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 6 | click | css=div:nth-child(1) > .list .list-title | 
    driver.findElement(By.cssSelector("div:nth-child(1) > .list .list-title")).click();
    // 7 | click | css=.valid-input-value:nth-child(1) | 
    driver.findElement(By.cssSelector(".valid-input-value:nth-child(1)")).click();
    // 8 | type | css=.valid-input-value:nth-child(1) | 4811 1111 1111 1114
    driver.findElement(By.cssSelector(".valid-input-value:nth-child(1)")).sendKeys("4811 1111 1111 1114");
    // 9 | click | id=card-expiry | 
    driver.findElement(By.id("card-expiry")).click();
    // 10 | type | id=card-expiry | 12/24
    driver.findElement(By.id("card-expiry")).sendKeys("12/24");
    // 11 | click | id=card-cvv | 
    driver.findElement(By.id("card-cvv")).click();
    // 12 | type | id=card-cvv | 123
    driver.findElement(By.id("card-cvv")).sendKeys("123");
    // 13 | click | css=.btn | 
    driver.findElement(By.cssSelector(".btn")).click();
    // 14 | selectFrame | index=0 | 
    driver.switchTo().frame(0);
    // 15 | click | id=otp | 
    driver.findElement(By.id("otp")).click();
    // 16 | type | id=otp | 112233
    driver.findElement(By.id("otp")).sendKeys("112233");
    // 17 | click | name=ok | 
    driver.findElement(By.name("ok")).click();
    // 18 | selectFrame | relative=parent | 
    driver.switchTo().defaultContent();
    // 19 | mouseOver | css=.btn | 
    {
      WebElement element = driver.findElement(By.cssSelector(".btn"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
  }
}

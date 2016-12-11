import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

/**
 * Created by PKETA on 12/11/2016.
 */
public class Lecture3 {

    public static final String CHROME_DRIVER = "D:\\Soft\\chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.bing.com/");
        //Открыть главную страницу поисковой системы Bing

                WebElement image = driver.findElement(By.id("scpl1"));
        image.click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.titleIs("Лента изображений Bing"));
        //Перейти в раздел поиска изображений. Дождаться, что заголовок страницы имеет название “Лента изображений Bing.”

        JavascriptExecutor scroll1 = (JavascriptExecutor) driver;
        scroll1.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        List<WebElement> imgElements1 = driver.findElements(By.tagName("img"));
        int counter1 = imgElements1.size();
        System.out.println(counter1);

        JavascriptExecutor scroll2 = (JavascriptExecutor) driver;
        scroll2.executeScript("window.scrollBy(0, document.body.scrollHeight)");

        WebDriverWait waitImg = new WebDriverWait(driver, 10);

        List<WebElement> imgElements2 = driver.findElements(By.tagName("img"));
        int counter2 = imgElements2.size();
        System.out.println(counter2);

        /*Выполнить прокрутку страницы несколько раз.
        Каждый раз проверять, что при достижении низа страницы подгружаются новые блоки с изображениями.
         */

        /*WebElement input = driver.findElement(By.cssSelector("input"));
        input.sendKeys("Christma");

        WebDriverWait waitList = new WebDriverWait(driver, 3);

        //WebElement filterByClass = driver.findElement(By.xpath("//*contains(@class,'sa_as')"));
        //filterByClass.click();

        //WebElement select = driver.findElement(By.id("sb_form_q"));
        //List<WebElement> allList = select.findElements(By.id("sb_form_q"));


        /*.getText("Christmas");
        for (WebElement option : allList) {
            System.out.println(option.getText("Christmas"));
            option.click();*/



        //Select select = new Select(driver.findElement(By.className("sa_as")));
        //select.selectByVisibleText("Christmas");

        WebElement input = driver.findElement(By.cssSelector("input"));
        input.sendKeys("Christmas");
        input.submit();

        /*List<WebElement> webElements = driver.findElements(By.className("ftrD"));
        for (WebElement webElement : webElements) {
            WebElement element = webElement.findElement(By.xpath(".//h2/a"));

        driver.findElement(By.cssSelector("a[title = В прошлом месяце]")).click();
            driver.findElement(By.cssSelector(".ftrD > a"));*/

        WebElement lastMonth = driver.findElement(By.xpath("//div[@class='ftrTB ftrP11']//option[4]"));
        selectLocator









        //driver.quit();


    }

}


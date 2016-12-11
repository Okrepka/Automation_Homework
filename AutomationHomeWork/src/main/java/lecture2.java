package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
/**
 * Created by PKETA on 12/11/2016.
 */
public class lecture2 {
    public static final String CHROME_DRIVER = "D:\\Soft\\chromedriver.exe";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER);
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.bing.com/");
        //Открыть главную страницу поисковой системы Bing

        WebElement queryInput = driver.findElement(By.name("q"));
        queryInput.sendKeys("automation");
        queryInput.submit();
        //Ввести в поле поиска поисковую фразу “automation”.

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("b_tween")));

        System.out.println("Page title is: " + driver.getTitle());
        //После перехода на страницу результатов вывести в консоль заголовок страницы.

        List<WebElement> webElements = driver.findElements(By.className("b_algo"));
        int counter = 1;
        System.out.println("Result titles:");
        for (WebElement webElement : webElements) {
            WebElement element = webElement.findElement(By.xpath(".//h2/a"));
            System.out.println("" + counter + ") " + element.getText());
            counter++;
            //Вывести список заголовков всех отображаемых результатов поиска. Вывод результатов первой страницы.
        }

        driver.quit();
    }
}
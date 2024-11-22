package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium
{
    /**
     * Navegador   - Google Chrome
     * Selenium    - selenium-java com [WebDriver Embutido]
     * Java        - JDK 11
     * */
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com.br");

        Thread.sleep(3000);
        driver.quit();
    }
}

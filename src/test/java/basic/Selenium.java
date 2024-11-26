package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium
{
    public static void main(String[] args) throws InterruptedException
    {
        /**
         * Navegador   - Google Chrome
         * Selenium    - selenium-java com [WebDriver Embutido]
         * Java        - JDK 11
         * */
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com.br");

        Thread.sleep(3000);
        driver.quit();
    }
}
